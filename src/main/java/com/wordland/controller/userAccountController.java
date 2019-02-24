package com.wordland.controller;


import com.wordland.model.S2VJSONResult;
import com.wordland.service.userAccountService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api")
public class userAccountController {

    @Autowired
    private userAccountService uaService;

    @ResponseBody
    @PostMapping("/login")
    S2VJSONResult doLogin(@RequestBody JSONObject jsonParam)throws Exception{
        String username = jsonParam.get("email").toString();
        String password = jsonParam.get("password").toString();

        String checkPwd = uaService.getPassword(username);
        JSONObject returnData = new JSONObject();
        returnData.put("name", username);
        returnData.put("setting", 0);
        if(password.equals(checkPwd)){
            return S2VJSONResult.all(true, 200, "success", returnData);
        }
        else{
            return S2VJSONResult.msg(false, 7000, "登录失败");
        }
    }
}
