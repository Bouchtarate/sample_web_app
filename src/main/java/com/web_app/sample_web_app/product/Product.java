package com.web_app.sample_web_app.product;

import org.springframework.stereotype.Component;

@Component
public class Product {

    private int id;
    private String name;
    private int price;

    public Product() {

    }

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return this.id;
    }

    public int getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }
}
