package com.db.tema4.service;

import com.db.tema4.model.Customers;
import com.db.tema4.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public List<Customers> getAllCustomers() {
        List<Customers> aux = new ArrayList<>();
        customerRepository.findAll().iterator().forEachRemaining(aux::add);
        return aux;
    }

    public Optional<Customers> getCustomerById(Integer id) {
        return customerRepository.findById(id);
    }

    public void insertCustomer(Customers customer) {
        customerRepository.save(customer);
    }

    public void updateCustomer(Customers customer) {
        customerRepository.save(customer);
    }

    public void deleteCustomer(Customers customer) {
        customerRepository.delete(customer);
    }
}
