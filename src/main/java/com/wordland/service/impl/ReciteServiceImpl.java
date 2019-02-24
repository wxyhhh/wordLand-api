package com.wordland.service.impl;

import com.wordland.service.ReciteService;
import com.wordland.model.CET4WordExample;
import com.wordland.model.CET6WordExample;
import com.wordland.dao.CET4WordMapper;
import com.wordland.dao.CET6WordMapper;
import com.wordland.dao.CustomMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class ReciteServiceImpl implements ReciteService {

    @Autowired
    private CET6WordMapper cet6WordMapper;
    @Autowired
    private CET4WordMapper cet4WordMapper;
    @Autowired
    private CustomMapper customMapper;

    @Override
    public HashMap<String, Object> getCET4Schedule(String user){

    }
    @Override
    public HashMap<String, Object> getCET6Schedule(String user){

    }

    @Override
    public HashMap<String, Object> getCET4Next(String user){

    }

    @Override
    public HashMap<String, Object> getCET6Next(String user){

    }

    @Override
    public boolean collectWord(String user, Integer presentNo, Integer catalog){

    }
}
