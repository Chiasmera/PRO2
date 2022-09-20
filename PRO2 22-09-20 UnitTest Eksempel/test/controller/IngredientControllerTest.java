package controller;

import model.Ingredient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IngredientControllerTest {

    @Test
    void storeIngredient_SameUnitError() {

        //Arrange
        IngredientController ingredientController = new IngredientController();
        Ingredient testIngredient1 = new Ingredient("Mel", Ingredient.Unit.GRAM, 200);
        Ingredient testIngredient2 = new Ingredient("Mel", Ingredient.Unit.TSP, 5);
        ingredientController.storeIngredient(testIngredient1);

        //Act & Assert
        Exception exception = assertThrows(RuntimeException.class, () -> ingredientController.storeIngredient(testIngredient2));

    }
}