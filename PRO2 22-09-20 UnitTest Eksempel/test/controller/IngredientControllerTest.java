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
        String errormessage ="Mismatch in ingredient unit and the stored ingredient unit. This ingredient uses the unit: " + Ingredient.Unit.TSP+ " while the stored ingredient uses the " + Ingredient.Unit.GRAM + " unit.";

        //Act & Assert
        Exception exception = assertThrows(RuntimeException.class, () -> ingredientController.storeIngredient(testIngredient2));
        assertEquals(errormessage, exception.getMessage());

    }

    @Test
    void collectIngredient_Lagerbeholdning() {
        //Arrange
        IngredientController ingredientController = new IngredientController();
        Ingredient testIngredient1 = new Ingredient("Mel", Ingredient.Unit.GRAM, 200);
        ingredientController.storeIngredient(testIngredient1);
        String ingredientName = "Mel";
        int amountCollected = 150;

        //Act
        ingredientController.collectIngredient(ingredientName, amountCollected);

        //Assert
        assertEquals(50, testIngredient1.getAmount());
    }

    @Test
    void collectIngredient_errrorMessage () {
        //Arrange
        IngredientController ingredientController = new IngredientController();
        Ingredient testIngredient1 = new Ingredient("Mel", Ingredient.Unit.GRAM, 200);
        ingredientController.storeIngredient(testIngredient1);
        String ingredientName = "Mel";
        int amountCollected = 250;
        String errormessage = "Not enough "+testIngredient1.getName()+". Supply only contains "+testIngredient1.getAmount()+" "+testIngredient1.getUnit();

        //Act & Assert
        Exception exception = assertThrows(RuntimeException.class, () -> ingredientController.collectIngredient(ingredientName, amountCollected));
        assertEquals(exception.getMessage(), errormessage);
    }
}