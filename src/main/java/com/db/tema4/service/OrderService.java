package com.db.tema4.service;

import com.db.tema4.model.Customers;
import com.db.tema4.model.Orders;
import com.db.tema4.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    public List<Orders> getAllOrders() {
        List<Orders> aux = new ArrayList<>();
        orderRepository.findAll().iterator().forEachRemaining(aux::add);
        return aux;
    }

    public Optional<Orders> getOrderById(Integer id) {
        return orderRepository.findById(id);
    }

    public void insertOrder(Orders order) {
        orderRepository.save(order);
    }

    public void updateOrder(Orders order) {
        orderRepository.save(order);
    }

    public void deleteOrder(Orders order) {
        orderRepository.delete(order);
    }
}
