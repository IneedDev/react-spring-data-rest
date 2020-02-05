package com.example.reactspringdatarest.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Component
public class HomeController {

    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }
}