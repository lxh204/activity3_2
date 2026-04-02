package com.example.activity3_2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("message", "Spring Boot");
        java.util.List<String> itemList = java.util.Arrays.asList("Java", "Spring", "Thymeleaf", "Boot");
        model.addAttribute("itemList", itemList);
        return "home";
    }
}
