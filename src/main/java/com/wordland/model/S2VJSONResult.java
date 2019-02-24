package com.wordland.model;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

/**
 * @Author:
 * @Description:
 * @Date: Created in 14:39 2018/11/15
 * @Modified by:
 */
public class S2VJSONResult {
    // 定义jackson对象
    private static final ObjectMapper MAPPER = new ObjectMapper();
    // 响应业务状态
//    private Integer status;
    private Integer code;//状态码
    private Boolean isSuccess;//状态
    private String message;//消息
    private Object data;//数据对象
    /**
     * 无参构造器
     */
    public S2VJSONResult(){
        super();
    }



    // 响应消息
//    private String msg;
    // 响应中的数据
//    private Object data;
//    private String ok;// 不使用

    public static S2VJSONResult all(Boolean success, Integer code,String message,Object data) {
        return new S2VJSONResult(success, code, message,  data);
    }

    public static S2VJSONResult msg(Boolean success, Integer code,String message) {
        return new S2VJSONResult(success, code, message);
    }

    public static S2VJSONResult data(Boolean success, Integer code,Object data) {
        return new S2VJSONResult(success, code, data);
    }

    public static S2VJSONResult ok(Object data) {
        return new S2VJSONResult(data);
    }


    public static S2VJSONResult ok() {
        return new S2VJSONResult(null);
    }




    /**
     * 只返回状态，状态码，消息
     * @param code
     * @param code
     * @param message
     */
    public S2VJSONResult(Integer code,Boolean success, String message) {
        super();
        this.code = code;
        this.message = message;
        this.isSuccess=success;
    }

    /**
     * 只返回状态，状态码，数据对象
     * @param success
     * @param code
     * @param data
     */
    public S2VJSONResult(Boolean success, Integer code, Object data){
        super();
        this.isSuccess=success;
        this.code=code;
        this.data=data;
    }

    /**
     * 返回全部信息即状态，状态码，消息，数据对象
     * @param success
     * @param code
     * @param message
     * @param data
     */
    public S2VJSONResult(Boolean success, Integer code, String message, Object data){
        super();
        this.isSuccess=success;
        this.code=code;
        this.message=message;
        this.data=data;
    }


    public S2VJSONResult(Object data) {
        this.code = 200;
        this.message = "OK";
        this.data = data;
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }


    public void setData(Object data) {
        this.data = data;
    }

    /**
     *      *
     *      * @Description: 将json结果集转化为LeeJSONResult对象
     *      *        需要转换的对象是一个类
     *      * @param jsonData
     *      * @param clazz
     *      * @return
     *     
     */


    public static S2VJSONResult formatToPojo(String jsonData, Class<?> clazz) {
        try {
            if (clazz == null) {
                return MAPPER.readValue(jsonData, S2VJSONResult.class);
            }
            JsonNode jsonNode = MAPPER.readTree(jsonData);
            JsonNode data = jsonNode.get("data");
            Object obj = null;
            if (clazz != null) {
                if (data.isObject()) {
                    obj = MAPPER.readValue(data.traverse(), clazz);
                } else if (data.isTextual()) {
                    obj = MAPPER.readValue(data.asText(), clazz);
                }
            }
            return all(true,jsonNode.get("code").intValue(), jsonNode.get("message").asText(), obj);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     *      *
     *      * @Description: 没有object对象的转化
     *      * @param json
     *      * @return
     *     
     */
    public static S2VJSONResult format(String json) {
        try {
            return MAPPER.readValue(json, S2VJSONResult.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    /**
     *      *
     *      * @Description: Object是集合转化
     *      *        需要转换的对象是一个list
     *      * @param jsonData
     *      * @param clazz
     *      * @return
     *     
     */
    public static S2VJSONResult formatToList(String jsonData, Class<?> clazz) {
        try {
            JsonNode jsonNode = MAPPER.readTree(jsonData);
            JsonNode data = jsonNode.get("data");
            Object obj = null;
            if (data.isArray() && data.size() > 0) {
                obj = MAPPER.readValue(data.traverse(),
                        MAPPER.getTypeFactory().constructCollectionType(List.class, clazz));
            }
            return all(true,jsonNode.get("status").intValue(), jsonNode.get("msg").asText(), obj);
        } catch (Exception e) {
            return null;
        }
    }


}
