package com.cydeo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

@RequestMapping("/welcome")
    public String homePage(Model model){

    // we use Model here, to execute a method belong to interface
       //method Model interface
    model.addAttribute("name","cydeo");
        return "student/welcome";

    }
}
