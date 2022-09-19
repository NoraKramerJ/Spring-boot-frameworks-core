package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {


    @RequestMapping("/home")
    // /home is the endpoint, and we can define it as anything we want, but we want it to be meaningful for users. example localhost:8080/home
    public String getHomePage(){
        return "home.html";
    }
    @RequestMapping()
    // /home is the endpoint, and we can define it as anything we want, but we want it to be meaningful for users. example localhost:8080/
    public String getHomePage2(){
        return "home.html";
    }

    @RequestMapping("/nora")
    // /home is the endpoint, and we can define it as anything we want, but we want it to be meaningful for users. example localhost:8080/nora
    public String getHomePage3(){
        return "home.html";
    }
    @RequestMapping({"/apple/nora","/orange"})
    // /home is the endpoint, and we can define it as anything we want,
    // but we want it to be meaningful for users. example localhost:8080/apple or localhost:8080/orange
    public String getHomePage4(){
        return "home.html";
    }
}
