package com.example.bastionhost.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/haha")
public class Mycontroller {
    @RequestMapping("/happy")
    public String getAllEmployees()
    {
        //application code
        return "to be happy";
    }
}
