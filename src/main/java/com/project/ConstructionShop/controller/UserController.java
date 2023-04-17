package com.project.ConstructionShop.controller;

import com.project.ConstructionShop.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @GetMapping
    public void signUp(){

    }
    @PostMapping
    public void signUp(@RequestBody User user){

    }
    @GetMapping
    public void signIn(){

    }
    @GetMapping
    public void signIn(String email, String password) {

    }
    @GetMapping
    public void changeDetails(int userID) {

    }
    @PutMapping
    public void changeDetails(@RequestBody User user) {

    }
    @GetMapping
    public void deleteAccount(int userID) {

    }
    @DeleteMapping
    public void deleteAccount(@RequestBody User user) {

    }
    @GetMapping
    public void topUpYourAccount() {

    }
    @PutMapping
    public void topUpYourAccount(float money) {

    }

}
