package com.example.foodapp.service;

import com.example.foodapp.models.Order;
import com.example.foodapp.models.SandwichIngredientModel;
import com.example.foodapp.repositories.OrderRepository;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class OrderService {
    private OrderRepository orderRepository;

    OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order addOrder(Order order) {
        if (order.getSandwiches().size() == 0) {
            throw new IllegalArgumentException("No sandwiches ordered");
        }
        BigDecimal subTotal = order.getSandwiches().stream()
                .map(sandwich ->
                    sandwich.getOrder().stream()
                        .map(SandwichIngredientModel::getIngredientPrice)
                        .reduce(BigDecimal.ZERO, BigDecimal::add))
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        BigDecimal total = subTotal.multiply(new BigDecimal("1.09"));

        order.setTotal(total);

        return orderRepository.addOrder(order);
    }

    public Order getOrder(String id) {
        return orderRepository.findOrder(id);
    }
}
