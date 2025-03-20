package com.web_app.sample_web_app.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/product")
    public List<Product> getProductData() {
        return service.getProducts();
    }
}
