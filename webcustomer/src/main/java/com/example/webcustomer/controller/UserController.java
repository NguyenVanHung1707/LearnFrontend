package com.example.webcustomer.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping
    public String userPage(Model model) {
        model.addAttribute("mess", "Welcome user page");
        return "user";
    }

    // Other methods for handling user-related requests
}
