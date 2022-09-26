package com.cydeo.controller;

import com.cydeo.bootstrap.DataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/register")//locahost:8080/student/register
    public String register(Model model){

        model.addAttribute("students", DataGenerator.createStudent());
        return "student/register";
    }
    @RequestMapping("/welcome")//locahost:8080/student/welcome?name=Nora
    public String Welcome(){


        return "student/welcome";
    }
}
