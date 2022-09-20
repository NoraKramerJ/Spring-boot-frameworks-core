package com.cydeo.controller;


import com.cydeo.Enums.Gender;
import com.cydeo.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MentorController {


    @RequestMapping("/MentorInfo")
    public String mentorInfo(Model model) {

       List<Mentor> mentorList=new ArrayList<>();
       mentorList.add(new Mentor("Maya", "Merkel",
                32, Gender.FEMALE));

       mentorList.add(new Mentor("Sara", "Russell",
                30, Gender.FEMALE));
        mentorList.add(new Mentor("Nadia", "Boban",
                29, Gender.FEMALE));

model.addAttribute("mentors",mentorList);


        return "mentor/mentor-List";
    }

}
