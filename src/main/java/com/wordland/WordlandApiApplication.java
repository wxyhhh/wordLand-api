package com.wordland;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wordland.dao")
public class WordlandApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(WordlandApiApplication.class, args);
    }

}
