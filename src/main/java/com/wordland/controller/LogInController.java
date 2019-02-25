package com.wordland.controller;

import com.wordland.model.S2VJSONResult;
import com.wordland.service.LogInService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@Controller
public class LogInController {
    @Autowired
    private LogInService logInService;

    @PostMapping("/login")
    @ResponseBody
    S2VJSONResult doLogIn(String email, String password) throws Exception{
//        String email = paramMap.get("email").toString();
//        String password = paramMap.get("password").toString();

        Integer code = logInService.checkLogIn(email, password);
        if(code == 200){
            return S2VJSONResult.all(true, 200, "success", logInService.doLogIn(email));
        }
        else{
            return S2VJSONResult.msg(false, code, "failure");
        }
    }


}
