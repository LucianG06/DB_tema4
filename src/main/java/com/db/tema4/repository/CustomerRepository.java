package com.db.tema4.repository;

import com.db.tema4.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {
    public List<Customer> findAll();
    public Customer getById(Integer id);
    public void insert(Customer customer);
    public void update(Integer id);
    public void delete(Customer customer);
}
