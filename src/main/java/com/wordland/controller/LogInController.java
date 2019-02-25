package com.wordland.controller;

import com.wordland.model.S2VJSONResult;
import com.wordland.service.LogInService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Controller
public class LogInController extends BaseController{
    @Autowired
    private LogInService logInService;

    @ResponseBody
    @PostMapping(value = "/login", consumes="application/json;charset=UTF-8")
    S2VJSONResult doLogIn(@RequestBody JSONObject jsonParam) throws Exception{
        String email = jsonParam.get("email").toString();
        String password = jsonParam.get("password").toString();
//        System.out.println(paramMap.getClass());
//        System.out.println(paramMap.keySet());
        Integer code = logInService.checkLogIn(email, password);
        if(code == 200){
            return S2VJSONResult.all(true, 200, "success", logInService.doLogIn(email));
        }
        else{
            return S2VJSONResult.msg(false, code, "failure");
        }
    }


}
