package com.tw.leewin.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tw.leewin.springmvc.service.EmployeeManager;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeManager employeeManager;

    @RequestMapping(value = "/allEmployees", method = RequestMethod.GET)
    public String getAllEmployees(Model model){
        model.addAttribute("employees", employeeManager.getAllEmployees());
        return "employees";
    }
}
