package com.application.blog.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Home");
        return "home";
    }
    @GetMapping("/support")
    public String support(Model model) {
        model.addAttribute("title", "Support");
        return "Support";
    }
}
