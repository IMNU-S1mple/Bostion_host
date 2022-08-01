package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Mycontroller {
    @RequestMapping("/happy")
    public String getAllEmployees()
    {
        //application code
        return "to be happy";
    }
}
