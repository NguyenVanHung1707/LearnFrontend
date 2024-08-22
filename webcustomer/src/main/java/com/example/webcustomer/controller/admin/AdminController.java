package com.example.webcustomer.controller.admin;

import CustomUserCustomUserDetails.CustomUserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.ui.Model;


@Controller
@RequestMapping("/admin")
public class AdminController {
    @RequestMapping("/welcome")
    public String adminPage(Model model) {
        model.addAttribute("mess", "Welcome to admin page");

        CustomUserDetails user =  (CustomUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("user", user);
        return "admin";
    }

}
