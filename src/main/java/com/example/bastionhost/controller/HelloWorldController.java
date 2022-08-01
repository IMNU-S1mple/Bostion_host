package com.example.bastionhost.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/view")
public class HelloWorldController {

    @RequestMapping("/hello")
    public String index() {
        // 这里访问地址是 http://127.0.0.1:8080/view/hello
        return "Hello World";
    }

    @RequestMapping("/hello2")
    public String hello2() {
        // 这里访问地址是 http://127.0.0.1:8080/view/hello2
        return "Hello World 2";
    }
}


