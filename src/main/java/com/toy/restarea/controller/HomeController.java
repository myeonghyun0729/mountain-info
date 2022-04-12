package com.toy.restarea.controller;

import com.toy.restarea.service.TestService;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HomeController {

    @Autowired
    private TestService testService;

    @GetMapping
    public String Home() {
        return "Hello Spring Boot";
    }

    @GetMapping("/test/create")
    public Map createTest() {
        Long id = testService.insertTest(RandomStringUtils.randomAlphabetic(4));
        if (id != null && id.intValue() <= 0) {
            return Map.of("result", "false");
        }
        return Map.of("result", "success");
    }
}
