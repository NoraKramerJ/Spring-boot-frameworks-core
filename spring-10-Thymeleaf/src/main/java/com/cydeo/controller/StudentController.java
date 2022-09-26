package com.cydeo.controller;

import com.cydeo.bootstrap.DataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/student")
public class StudentController {

   // @RequestMapping(value="/register", method=RequestMethod.GET)//locahost:8080/student/register
    // we use GetMapping instead of RequestMapping
    @GetMapping("/register")
    //GetMapping is used for writing on the main bar search
    public String register(Model model){

        model.addAttribute("students", DataGenerator.createStudent());
        return "student/register";
    }
    @RequestMapping(value="/welcome", method= RequestMethod.POST)//locahost:8080/student/welcome?name=Nora
    @PostMapping("/welcome")
    //PostMapping is used when writing data inside the page
    public String Welcome(@RequestParam String name){


        return "student/welcome";
    }
}
