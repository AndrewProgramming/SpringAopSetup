package com.andrew.springaopdemo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class HelloAopController {

    @RequestMapping("/")
    public String helloAop() {
        return "hello apo";
    }
}
