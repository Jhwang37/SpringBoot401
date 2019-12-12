package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String pageone(){
        return "pageone";
    }
    @GetMapping("/webtwo")
    public String pagetwo(){
        return "pagetwo";
    }

}
