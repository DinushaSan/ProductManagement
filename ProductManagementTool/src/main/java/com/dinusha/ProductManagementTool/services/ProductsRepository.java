package com.dinusha.ProductManagementTool.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dinusha.ProductManagementTool.Models.Product;

public interface ProductsRepository extends JpaRepository<Product, Integer> {

}
