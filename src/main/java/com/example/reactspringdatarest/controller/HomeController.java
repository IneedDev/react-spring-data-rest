package com.example.reactspringdatarest.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@Controller
@RestController
public class HomeController {

    @RequestMapping(value = "/api")
    public String index() {
        return "Hello, the time at the server is now " + new Date() + "\n";

    }
}
