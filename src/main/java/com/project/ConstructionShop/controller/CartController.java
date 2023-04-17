package com.project.ConstructionShop.controller;

import com.project.ConstructionShop.model.Cart;
import com.project.ConstructionShop.model.CartProduct;
import org.springframework.web.bind.annotation.*;

@RestController
public class CartController {
    @PostMapping
    public void addProductToCart(int cartID, int productID) {

    }
    @GetMapping
    public void deleteProductFromCart(int cartProductID) {

    }
    @DeleteMapping
    public void deleteProductFromCart(CartProduct cartProduct) {

    }
    @GetMapping
    public void getUserCart(int cartID) {

    }
    @GetMapping
    public void deleteCart(int cartID) {

    }
    @DeleteMapping
    public void deleteCart(@RequestBody Cart cart) {

    }
}
