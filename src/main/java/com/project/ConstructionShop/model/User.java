package com.project.ConstructionShop.model;

import org.hibernate.annotations.Entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int ID;
    @Column(name="first_name")
    private String firstName;
    @Column(name="second_name")
    private String secondName;
    @Column(name="email")
    private String email;
    @Column(name="password")
    private String password;
    @Column(name="account balance")
    private float accountBalance;
    @OneToOne
    private Cart cart;
    @OneToMany
    @Column(nullable = true)
    private Collection<Product> products;
    public User(String firstName, String secondName, String email, String password, float accountBalance, Cart cart, Collection<Product> products) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.email = email;
        this.password = password;
        this.accountBalance = accountBalance;
        this.cart = cart;
        this.products = products;
    }
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getSecondName() {
        return secondName;
    }
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public float getAccountBalance() {
        return accountBalance;
    }
    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }
    public Cart getCart() {
        return cart;
    }
    public void setCart(Cart cart) {
        this.cart = cart;
    }
    public Collection<Product> getProducts() {
        return products;
    }
    public void setProducts(Collection<Product> products) {
        this.products = products;
    }
}
