package com.web_app.sample_web_app.product;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

    List<Product> products = Arrays.asList(new Product(1, "Tlaja", 2500), new Product(2, "Iphone", 7500), new Product(3, "Mac book pro", 12000));

    public List<Product> getProducts() {
        return products;
    }
}
