package com.example.foodapp.repositories;

import com.example.foodapp.models.FoodCategory;
import com.example.foodapp.models.SandwichIngredientModel;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Component
public class SandwichRepository {
    private List<SandwichIngredientModel> ingredients = new ArrayList<>();

    SandwichRepository() {
        SandwichIngredientModel whiteBread = new SandwichIngredientModel(
                UUID.randomUUID().toString(),
                "White Bread",
                new BigDecimal("1.50"),
                FoodCategory.BREAD
        );

        ingredients.add(whiteBread);

        SandwichIngredientModel wheatBread = new SandwichIngredientModel(
                UUID.randomUUID().toString(),
                "Wheat Bread",
                new BigDecimal("1.55"),
                FoodCategory.BREAD
        );

        ingredients.add(wheatBread);

        SandwichIngredientModel americanCheese = new SandwichIngredientModel(
                UUID.randomUUID().toString(),
                "American Cheese",
                new BigDecimal(".15"),
                FoodCategory.CHEESE
        );

        ingredients.add(americanCheese);

        SandwichIngredientModel swissCheese = new SandwichIngredientModel(
                UUID.randomUUID().toString(),
                "Swiss Cheese",
                new BigDecimal(".25"),
                FoodCategory.CHEESE
        );

        ingredients.add(swissCheese);

        SandwichIngredientModel provolone = new SandwichIngredientModel(
                UUID.randomUUID().toString(),
                "Provolone",
                new BigDecimal(".22"),
                FoodCategory.CHEESE
        );

        ingredients.add(provolone);

        SandwichIngredientModel ham = new SandwichIngredientModel(
                UUID.randomUUID().toString(),
                "ham",
                new BigDecimal("1.00"),
                FoodCategory.MEAT
        );

        ingredients.add(ham);

        SandwichIngredientModel turkey = new SandwichIngredientModel(
                UUID.randomUUID().toString(),
                "turkey",
                new BigDecimal("1.00"),
                FoodCategory.MEAT
        );

        ingredients.add(turkey);

        SandwichIngredientModel roastBeef = new SandwichIngredientModel(
                UUID.randomUUID().toString(),
                "roast beef",
                new BigDecimal(".95"),
                FoodCategory.MEAT
        );

        ingredients.add(roastBeef);

        SandwichIngredientModel chicken = new SandwichIngredientModel(
                UUID.randomUUID().toString(),
                "chicken",
                new BigDecimal("1.25"),
                FoodCategory.MEAT
        );

        ingredients.add(chicken);

        SandwichIngredientModel bacon = new SandwichIngredientModel(
                UUID.randomUUID().toString(),
                "bacon",
                new BigDecimal("1.00"),
                FoodCategory.MEAT
        );

        ingredients.add(bacon);

        SandwichIngredientModel lettuce = new SandwichIngredientModel(
                UUID.randomUUID().toString(),
                "lettuce",
                new BigDecimal(".15"),
                FoodCategory.VEGGIES
        );

        ingredients.add(lettuce);

        SandwichIngredientModel tomato = new SandwichIngredientModel(
                UUID.randomUUID().toString(),
                "tomato",
                new BigDecimal(".15"),
                FoodCategory.VEGGIES
        );

        ingredients.add(tomato);

        SandwichIngredientModel onion = new SandwichIngredientModel(
                UUID.randomUUID().toString(),
                "onion",
                new BigDecimal(".15"),
                FoodCategory.VEGGIES
        );

        ingredients.add(onion);

        SandwichIngredientModel mayo = new SandwichIngredientModel(
                UUID.randomUUID().toString(),
                "mayo",
                new BigDecimal(".05"),
                FoodCategory.CONDIMENTS
        );

        ingredients.add(mayo);

        SandwichIngredientModel mustard = new SandwichIngredientModel(
                UUID.randomUUID().toString(),
                "mustard",
                new BigDecimal(".05"),
                FoodCategory.CONDIMENTS
        );

        ingredients.add(mustard);

        SandwichIngredientModel ranch = new SandwichIngredientModel(
                UUID.randomUUID().toString(),
                "ranch",
                new BigDecimal(".05"),
                FoodCategory.CONDIMENTS
        );

        ingredients.add(ranch);

        SandwichIngredientModel oil = new SandwichIngredientModel(
                UUID.randomUUID().toString(),
                "oil",
                new BigDecimal(".05"),
                FoodCategory.CONDIMENTS
        );

        ingredients.add(oil);

        SandwichIngredientModel vinegar = new SandwichIngredientModel(
                UUID.randomUUID().toString(),
                "vinegar",
                new BigDecimal(".05"),
                FoodCategory.CONDIMENTS
        );

        ingredients.add(vinegar);


    }

    public  List<SandwichIngredientModel> getAllIngredients() {
        return ingredients;
    }

    public Optional<SandwichIngredientModel> getIngredientById(String id) {
        return ingredients.stream().filter(ingredient -> ingredient.getId().equals(id)).findFirst();
    }
}
