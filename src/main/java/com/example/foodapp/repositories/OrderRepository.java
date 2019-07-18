package com.example.foodapp.repositories;

import com.example.foodapp.models.Order;
import com.example.foodapp.models.OrderStatus;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Component
public  class OrderRepository {
    Map<String, Order> orders = new HashMap<>();

    public Order addOrder(Order order) {
        String id = UUID.randomUUID().toString();
        order.setId(id);
        order.setStatus(OrderStatus.IN_PROGRESS);
        orders.put(id, order);
        return order;
    }

    public Order findOrder(String id) {
        return orders.get(id);
    }
}