package com.db.tema4.controllers;

import com.db.tema4.model.Products;
import com.db.tema4.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/products/all")
    public List<Products> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/products/{id}")
    public Optional<Products> getProductById(@PathVariable String id) {
        return productService.getProductById(id);
    }

    @PostMapping("/products/insert")
    public void insertProduct(@RequestBody Products product) {
        productService.insertProduct(product);
    }

    @PostMapping("/products/update")
    public void updateProduct(@RequestBody Products product) {
        productService.updateProduct(product);
    }

    @DeleteMapping("/products/delete")
    public void deleteProduct(@RequestBody Products product) {
        productService.deleteProduct(product);
    }
}
