package com.daniel.cart.bean;

import java.util.List;

public class Cart {

    private int totalItems;
    private double totalPrice;

    List<Product>products;

    public Cart(int totalItems, double totalPrice, List<Product> products) {
        this.totalItems = totalItems;
        this.totalPrice = totalPrice;
        this.products = products;
    }

    public int getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(int totalItems) {
        this.totalItems = totalItems;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
