package com.digitalinnovationone.product_catalog.service;

import com.digitalinnovationone.product_catalog.model.Product;
import com.digitalinnovationone.product_catalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public Product create(Product product){
        return productRepository.save(product);
    }

    public List<Product> getAll(){
        return (List<Product>) productRepository.findAll();
    }
}
