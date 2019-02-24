package com.wordland.service;

import java.util.HashMap;

public interface ReciteService {
    HashMap<String, Object> getCET4Schedule(String user);
    HashMap<String, Object> getCET6Schedule(String user);
    HashMap<String, Object> getCET4Next(String user);
    HashMap<String, Object> getCET6Next(String user);
    boolean collectWord(String user, Integer presentNo, Integer catalog);
}
