package com.db.tema4.service;

import com.db.tema4.model.Customers;
import com.db.tema4.model.Products;
import com.db.tema4.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Products> getAllProducts() {
        List<Products> aux = new ArrayList<>();
        productRepository.findAll().iterator().forEachRemaining(aux::add);
        return aux;
    }

    public Optional<Products> getProductById(String id) {
        return productRepository.findById(id);
    }

    public void insertProduct(Products product) {
        productRepository.save(product);
    }

    public void updateProduct(Products product) {
        productRepository.save(product);
    }

    public void deleteProduct(Products product) {
        productRepository.delete(product);
    }
}
