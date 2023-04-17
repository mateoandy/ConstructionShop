package com.project.ConstructionShop.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="cart_products")
public class CartProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int ID;
    @Column(nullable = false)
    private Product product;
    @Column(name="amount")
    private int amount;
    public CartProduct(Product product, int amount) {
        this.product = product;
        this.amount = amount;
    }
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
}
