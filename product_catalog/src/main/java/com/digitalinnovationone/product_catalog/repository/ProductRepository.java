package com.digitalinnovationone.product_catalog.repository;

import com.digitalinnovationone.product_catalog.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> { }
