package com.db.tema4.controllers;

import com.db.tema4.model.Customer;
import com.db.tema4.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/customers/all")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }
}
