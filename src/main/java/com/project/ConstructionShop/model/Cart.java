package com.project.ConstructionShop.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name="carts")
public class Cart {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int ID;
    @Column(name="total_price")
    private float totalPrice;
    @OneToMany
    @Column(nullable = false)
    private Collection<CartProduct> cartProducts;
    public Cart(float totalPrice, Collection<CartProduct> cartProducts) {
        this.totalPrice = totalPrice;
        this.cartProducts = cartProducts;
    }
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public float getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }
    public Collection<CartProduct> getCartProducts() {
        return cartProducts;
    }
    public void setCartProducts(Collection<CartProduct> cartProducts) {
        this.cartProducts = cartProducts;
    }
}
