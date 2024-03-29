package com.example.cartServices.services;

import com.example.cartServices.models.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();

    Product getSingleProduct(Long id);

    Product createProduct(Product product);
}