package com.db.tema4.controllers;

import com.db.tema4.model.Customers;
import com.db.tema4.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/customers/all")
    public List<Customers> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @GetMapping("/customers/{id}")
    public Optional<Customers> getCustomerById(@PathVariable Integer id) {
        return customerService.getCustomerById(id);
    }

    @PostMapping("/customers/insert")
    public void insertCustomer(@RequestBody Customers customer) {
        customerService.insertCustomer(customer);
    }

    @PostMapping("/customers/update")
    public void updateCustomer(@RequestBody Customers customer) {
        customerService.updateCustomer(customer);
    }

    @DeleteMapping("/customers/delete")
    public void deleteCustomer(@RequestBody Customers customer) {
        customerService.deleteCustomer(customer);
    }
}
