package com.example.foodapp.service;

import com.example.foodapp.models.Order;
import com.example.foodapp.models.Sandwich;
import com.example.foodapp.models.SandwichIngredientModel;
import com.example.foodapp.repositories.OrderRepository;
import com.example.foodapp.repositories.SandwichRepository;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class OrderService {
    private OrderRepository orderRepository;
    private SandwichRepository sandwichRepository;

    OrderService(OrderRepository orderRepository, SandwichRepository sandwichRepository) {
        this.orderRepository = orderRepository;
        this.sandwichRepository = sandwichRepository;
    }

    public Order addOrder(Order order) {

        List<String> idList = new ArrayList<>();

        for (Sandwich sandwich : order.getSandwiches()) {
            for (SandwichIngredientModel ingredient : sandwich.getOrder()) {
                idList.add(ingredient.getId());
            }
        }

        BigDecimal subTotal = idList.stream()
                .map(id -> sandwichRepository.getIngredientById(id).getIngredientPrice())
                .reduce(BigDecimal.ZERO, BigDecimal::add);



        if (order.getSandwiches().size() == 0) {
            throw new IllegalArgumentException("No sandwiches ordered");
        }

        BigDecimal total = subTotal.multiply(new BigDecimal("1.09"));

        order.setTotal(total);

        return orderRepository.addOrder(order);
    }

    public Order getOrder(String id) {
        return orderRepository.findOrder(id);
    }
}
