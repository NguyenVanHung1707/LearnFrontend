package com.example.webcustomer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @RequestMapping(value = { "/", "/login" })
    public String login(@RequestParam(value = "error", required = false) String error, Model model) {
        if (error != null) {
            model.addAttribute("mess", "Login failed!");
        }
        return "login";
    }

    @RequestMapping("/logout")
    public String logout(Model model) {
        model.addAttribute("mess", "Has Logged out!!!");
        return "login";
    }

}