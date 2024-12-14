
package com.dinusha.ProductManagementTool.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dinusha.ProductManagementTool.Models.Product;
import com.dinusha.ProductManagementTool.services.ProductsRepository;

@Controller
@RequestMapping("/normalUser")
public class UserProductController {

    @Autowired
    private ProductsRepository repo;

    @GetMapping({"", "/"})
    public String showUserProductList(Model model) {
        // Fetch all products sorted by ID in descending order
        List<Product> products = repo.findAll(Sort.by(Sort.Direction.DESC, "id"));
        model.addAttribute("products", products);
        return "normalUser/index"; // Return a view specifically for users
    }
}