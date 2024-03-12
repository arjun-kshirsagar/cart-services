package com.example.cartServices.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    private Long id;
    private String title;
    private String date;
    private double price;
    private Category category;
    private String imageUrl;
}

/*
    this is a model file Product.java => it contains the structure of the product object
    c
*/ 