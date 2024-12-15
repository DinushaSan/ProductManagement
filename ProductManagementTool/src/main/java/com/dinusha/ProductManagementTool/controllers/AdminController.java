package com.dinusha.ProductManagementTool.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dinusha.ProductManagementTool.services.AdminService;

@Controller
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/admin")
    public String loginPage() {
        return "admin/adminLogin"; // The name of the HTML file for the login page
    }

    @PostMapping("/adminLogin")
    public String login(@RequestParam String username, 
                        @RequestParam String password, 
                        Model model) {
        boolean isAuthenticated = adminService.authenticate(username, password);
        if (isAuthenticated) {
            return "redirect:/products";
        } else {
            model.addAttribute("error", "Invalid username or password.");
            return "admin/adminLogin"; // Reload login page with error message
        }
    }
}

