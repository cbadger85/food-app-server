package com.example.foodapp.models;

import lombok.Data;

import java.util.List;

@Data
public class Sandwich {
    String id;
    List<SandwichIngredientModel> order;
}
