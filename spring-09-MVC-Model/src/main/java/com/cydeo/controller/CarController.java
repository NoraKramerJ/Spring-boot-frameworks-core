package com.cydeo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CarController {


    @RequestMapping("/info")
    public String carInfo(@RequestParam String make, Model model){
        //localhost:8080/info3?make=honda
        //ReuestParam works with query parameters

     model.addAttribute("make",make);

        return "car/car-info";

    }
    @RequestMapping("/info2")
    public String carInfo2(@RequestParam(value = "make",required = false,defaultValue = "KIA") String make, Model model){
//localhost:8080/info2?make(KIA)
        model.addAttribute("make",make);

        return "car/car-info";
    }
    @RequestMapping("/info")
    public String carInfo3(@RequestParam String make, @RequestParam int year, Model model){
        //localhost:8080/info3?make=honda&year=2015
        //RequestParam works with query parameters

        model.addAttribute("make",make);
        model.addAttribute("year",year);

        return "car/car-info";

    }
}
