package com.digitalinnovationone.shopping_cart.controller;

import com.digitalinnovationone.shopping_cart.model.Cart;
import com.digitalinnovationone.shopping_cart.model.Item;
import com.digitalinnovationone.shopping_cart.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartRepository cartRepository;

    @PostMapping("/{id}")
    public Cart addItem(@PathVariable("id") Integer id, @RequestBody Item item){
        Optional<Cart> savedCart = cartRepository.findById(id);
        Cart cart;
        if(savedCart.equals(Optional.empty())){
            cart = new Cart(id);
        }
        else{
            cart = savedCart.get();
        }
        cart.getItems().add(item);
        return cartRepository.save(cart);
    }

    @GetMapping("/{id}")
    public Optional<Cart> findCartById(@PathVariable("id") Integer id){
        return cartRepository.findById(id);
    }

    @GetMapping
    public List<Cart> findAllCarts(){
        return (List<Cart>) cartRepository.findAll();
    }

    @DeleteMapping("/{id}")
    public void clearCart(@PathVariable("id") Integer id){
        cartRepository.deleteById(id);
    }
}
