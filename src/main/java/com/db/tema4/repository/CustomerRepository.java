package com.db.tema4.repository;

import com.db.tema4.model.Customers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customers, Integer> {
}
