package com.digitalinnovationone.shopping_cart.repository;

import com.digitalinnovationone.shopping_cart.model.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Integer> {
}
