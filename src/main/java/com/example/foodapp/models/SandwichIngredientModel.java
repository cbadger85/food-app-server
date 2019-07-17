package com.example.foodapp.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class SandwichIngredientModel {
    String id;
    String ingredientName;
    BigDecimal ingredientPrice;
    FoodCategory category;
}
