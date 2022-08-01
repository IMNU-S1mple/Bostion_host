package com.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController
{
    @RequestMapping("/employee-management/employees")
    public String getAllEmployees(Model model)
    {
        //application code
        return "employeesList";
    }
}

