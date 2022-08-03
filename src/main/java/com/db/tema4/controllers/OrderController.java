package com.db.tema4.controllers;

import com.db.tema4.model.Orders;
import com.db.tema4.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/orders/all")
    public List<Orders> getAllOrders() {
        return orderService.getAllOrders();
    }

    @GetMapping("/orders/{id}")
    public Optional<Orders> getOrderById(@PathVariable Integer id) {
        return orderService.getOrderById(id);
    }

    @PostMapping("/orders/insert")
    public void insertOrder(@RequestBody Orders order) {
        orderService.insertOrder(order);
    }

    @PostMapping("/orders/update")
    public void updateOrder(@RequestBody Orders order) {
        orderService.updateOrder(order);
    }

    @DeleteMapping("/orders/delete")
    public void deleteOrder(@RequestBody Orders order) {
        orderService.deleteOrder(order);
    }
}
