package com.example.foodapp.models;

import com.example.foodapp.models.OrderStatus;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class Order {
    String id;
    List<Sandwich> sandwiches;
    OrderStatus status;
    BigDecimal total;
}
