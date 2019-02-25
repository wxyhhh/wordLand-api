package com.wordland.service;

import java.util.HashMap;

public interface LogInService {
    Integer checkLogIn(String email, String password);
    HashMap<String, Object> doLogIn(String email);
}
