package com.web_app.sample_web_app.product;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final List<Product> products = new ArrayList<>();

    public ProductService() {
        this.products.add(new Product(1, "Tlaja", 2500));
        this.products.add(new Product(2, "Iphone", 7500));
        this.products.add(new Product(3, "MacBookPro", 12500));
    }

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductById(int productId) {
        return products.stream()
                .filter(p -> p.getId() == productId)
                .findFirst()
                .get();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void updateProduct(Product product) {
        int index = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == product.getId()) {
                index = i;
            }
        }
        products.set(index, product);
    }

    public void deleteProduct(int productId) {
        int index = 0;
        for (int i = 0; products.size() < i; i++) {
            if (products.get(i).getId() == productId) {
                index = i;
            }
        }
        products.remove(index);
    }
}
