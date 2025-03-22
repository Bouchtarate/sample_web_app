package com.web_app.sample_web_app.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepo;

    public ProductService() {

    }

    // private final List<Product> products = new ArrayList<>();
    // public ProductService() {
    //     this.products.add(new Product(1, "Tlaja", 2500));
    //     this.products.add(new Product(2, "Iphone", 7500));
    //     this.products.add(new Product(3, "MacBookPro", 12500));
    // }
    public List<Product> getProducts() {
        return productRepo.findAll();
    }

    public Product getProductById(Long productId) {
        // return products.stream()
        //         .filter(p -> p.getId() == productId)
        //         .findFirst()
        //         .get();
        return productRepo.findById(productId).orElseThrow(() -> new RuntimeException("Product not found"));
    }

    public void addProduct(Product product) {
        productRepo.save(product);
    }

    // Update a product using PUT (replace entire resource)
    public Product updateProduct(Long id, Product productDetails) {
        Product product = productRepo.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));
        product.setName(productDetails.getName());
        product.setPrice(productDetails.getPrice());
        return productRepo.save(product);
    }

    public void deleteProduct(Long productId) {
        productRepo.deleteById(productId);
    }
}
