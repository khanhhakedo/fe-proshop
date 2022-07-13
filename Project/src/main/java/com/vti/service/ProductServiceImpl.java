package com.vti.service;

import com.vti.entity.Product;
import com.vti.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;


    public List<Product> getall() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Integer id) {
        Product product = productRepository.getProductById(id);
        return product;
    }


}
