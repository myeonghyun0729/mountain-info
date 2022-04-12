package com.toy.restarea.service;

import com.toy.restarea.mapper.TestMapper;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class TestService {

    @Autowired
    TestMapper testMapper;

    public Long insertTest(String title) {
        return testMapper.insertTest(title);
    }
}
