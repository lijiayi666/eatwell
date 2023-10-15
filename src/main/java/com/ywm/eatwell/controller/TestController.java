package com.ywm.eatwell.controller;

import com.ywm.eatwell.po.TestUser;
import com.ywm.eatwell.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("test")
    public String test(){
        return "ok";
    }

    @GetMapping("testDB")
    public List<TestUser> testDB(){
        return testService.getTestUserInfo();
    }
}
