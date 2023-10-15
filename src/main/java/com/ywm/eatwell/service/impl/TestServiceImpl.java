package com.ywm.eatwell.service.impl;

import com.ywm.eatwell.po.TestUser;
import com.ywm.eatwell.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public List<TestUser> getTestUserInfo() {
        return null;
    }
}
