package com.example.foodapp.controllers;

import com.example.foodapp.models.SandwichIngredientModel;
import com.example.foodapp.repositories.SandwichRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class SandwichController {
    SandwichRepository repository;

    public SandwichController(SandwichRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/ingredients")
    public List<SandwichIngredientModel> getAllIngredients() {
        return repository.getAllIngredients();
    }

    @GetMapping("/ingredients/{id}")
    public SandwichIngredientModel getIngredientById(@PathVariable String id) {
        return repository.getIngredientById(id);
    }
}
