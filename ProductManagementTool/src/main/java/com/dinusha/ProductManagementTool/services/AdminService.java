package com.dinusha.ProductManagementTool.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dinusha.ProductManagementTool.Models.Admin;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    public boolean authenticate(String username, String password) {
        Optional<Admin> admin = adminRepository.findByUsername(username);
        return admin.isPresent() && admin.get().getPassword().equals(password);
    }
}
