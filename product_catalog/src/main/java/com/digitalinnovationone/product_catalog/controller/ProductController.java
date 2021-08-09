package com.digitalinnovationone.product_catalog.controller;
import com.digitalinnovationone.product_catalog.model.Product;
import com.digitalinnovationone.product_catalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping
    public Product create(@RequestBody Product product){
        return productRepository.save(product);
    }
/*
    @GetMapping
    public List<Product> getAll(){
        return productService.getAll();
    }*/

}
