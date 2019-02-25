package com.wordland.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class BaseController {
	
    protected HttpServletRequest request;
    protected HttpServletResponse response;
    protected HttpSession session;
	
    public Map<String, Object> generateNormalResult(Object record) {
        Map<String, Object> result = new HashMap<>();
        result.put("data", record);
        result.put("code", "0");
        result.put("message", "Success");
        return result;
    }

    public Map<String, Object> generateErrorResult(Exception e) {
        Map<String, Object> result = new HashMap<>();
        result.put("data", null );
        result.put("code", "1");
        result.put("message", "Error-"+e.getMessage());
        return result;
    }


    public Map<String, Object> generateErrorResult(String msg) {
        Map<String, Object> result = new HashMap<>();
        result.put("data", null );
        result.put("code", "1");
        result.put("message", msg);
        return result;
    }

    public Map<String, Object> generateErrorResult(Map<String, Object> data, String msg) {
        Map<String, Object> result = new HashMap<>();
        result.put("data", data );
        result.put("code", "1");
        result.put("message", msg);
        return result;
    }
}
