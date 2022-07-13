package com.vti.controller;

import com.vti.Dto.ProductDto;
import com.vti.entity.Product;
import com.vti.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(value = "api/v1/products")

public class ProductController {
    @Autowired
    private ProductService productService;


    @GetMapping()
    public ResponseEntity<?> getAllProducts() {
        List<Product> products = productService.getall();
        List<ProductDto> productDtos = new ArrayList<>();
        for (Product product : products) {
            ProductDto productDto = new ProductDto();
            productDto.setId(product.getId());
            productDto.setPrice(product.getPrice());
            productDto.setBrand(product.getBrand());
            productDto.setName(product.getName());
            productDto.setImage(product.getImage());
            productDto.setDescription(product.getDescription());
            productDto.setRating(product.getRating());
            productDto.setCountInStock(product.getCountInStock());
            productDto.setNumReviews(product.getNumReviews());
//            productDto.setCategory(product.getCategory());
            productDto.setCategory(product.getCategory().getCategory());
            productDtos.add(productDto);
        }
        return new ResponseEntity<>(productDtos, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getProductById(@PathVariable("id") Integer id) {
//        List<Product> products = productService.getProductById(id);
        Product product = productService.getProductById(id);
//        List<ProductDto> productDtos = new ArrayList<>();
//        for (Product product : products){
        ProductDto productDto = new ProductDto();
        productDto.setId(product.getId());
        productDto.setPrice(product.getPrice());
        productDto.setBrand(product.getBrand());
        productDto.setName(product.getName());
        productDto.setImage(product.getImage());
        productDto.setDescription(product.getDescription());
        productDto.setRating(product.getRating());
        productDto.setCountInStock(product.getCountInStock());
        productDto.setNumReviews(product.getNumReviews());
//            productDto.setCategory(product.getCategory());
        productDto.setCategory(product.getCategory().getCategory());
//            productDtos.add(productDto);
//        }
        return new ResponseEntity<>(productDto, HttpStatus.OK);
    }
}
