package com.vti.service;

import com.vti.entity.Product;

import java.util.List;

public interface ProductService {
    public List<Product> getall();
//    List<Product> getProductById (Integer id);

    public Product getProductById(Integer id);
}
