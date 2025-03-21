package com.web_app.sample_web_app.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getProductData() {
        return service.getProducts();
    }

    @GetMapping("/products/{productId}")
    public Product getProductById(@PathVariable int productId) {
        return service.getProductById(productId);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product product) {
        service.addProduct(product);
    }

}
