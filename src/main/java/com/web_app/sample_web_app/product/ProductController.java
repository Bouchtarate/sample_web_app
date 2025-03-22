package com.web_app.sample_web_app.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping
    public List<Product> getProductData() {
        return service.getProducts();
    }

    @GetMapping("/{productId}")
    public Product getProductById(@PathVariable Long productId) {
        return service.getProductById(productId);
    }

    @PostMapping
    public void addProduct(@RequestBody Product product) {
        service.addProduct(product);
    }

    @PutMapping("/{productId}")
    public void updateProduct(@PathVariable Long productId, @RequestBody Product product) {
        service.updateProduct(productId, product);
    }

    @DeleteMapping("/{productId}")
    public void deleteProduct(@PathVariable Long productId) {
        service.deleteProduct(productId);
    }

}
