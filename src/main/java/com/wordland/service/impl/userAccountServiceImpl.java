package com.wordland.service.impl;

import com.wordland.service.userAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userAccountServiceImpl implements userAccountService {

    @Autowired
    private userAccountMapper uaMapper;

    @Override
    public String getPassword(String username){
        userAccountExample example = new userAccountExample();
        example.or().andUsernameEqualTo(username);
        String result = uaMapper.selectByPrimaryKey(username).getPassword();
        return result;
    }
}
