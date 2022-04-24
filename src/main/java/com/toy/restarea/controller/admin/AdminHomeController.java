package com.toy.restarea.controller.admin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminHomeController {

    @Autowired
    private static Logger logger = LoggerFactory.getLogger(AdminHomeController.class);

    @GetMapping
    public String home() {
        logger.info("home!");
        return "admin/home";
    }

    @GetMapping("/dashboard")
    public String dashboard() {
        logger.info("dashboard!");
        return "dashboard";
    }

}
