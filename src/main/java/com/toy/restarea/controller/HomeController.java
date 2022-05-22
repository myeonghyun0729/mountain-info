package com.toy.restarea.controller;

import com.toy.restarea.service.TestService;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Map;

@Controller
public class HomeController {

    @Autowired
    private TestService testService;

    @Autowired
    private Environment environment;

    @GetMapping
    public String home(Model model) {
        String today = DateFormatUtils.format(new Date(), "yyyy-MM-dd");
        model.addAttribute("today", today);
        model.addAttribute("kakaoMapKey", environment.getProperty("kakao-map-key"));
        return "home";
    }
}
