package com.rhiodamuthie.springmvc;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/mvc")
@Controller
public class HelloController {

    @GetMapping("/hello")
    public String printHello(ModelMap model){
        model.addAttribute("message","Hello Spring MVC....!");
        return "hello";
    }
}
