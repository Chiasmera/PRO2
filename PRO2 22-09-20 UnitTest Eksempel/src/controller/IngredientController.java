package controller;

import model.Ingredient;

import java.util.HashMap;

public class IngredientController implements IngredientControllerI {

    private final HashMap<String, Ingredient> ingredients;

    public IngredientController() {
        this.ingredients = new HashMap<>();
    }

    @Override
    public Ingredient storeIngredient(Ingredient ingredient) {
        Ingredient ingredientStored = ingredients.get(ingredient.getName());

        if (ingredientStored != null) {
            if (ingredient.getUnit().equals(ingredientStored.getUnit())) {
                ingredientStored.setAmount(ingredientStored.getAmount() + ingredient.getAmount());
                return ingredientStored;
            } else {
                String message = "Mismatch in ingredient unit and the stored ingredient unit. This ingredient uses the unit: " + ingredient.getUnit() + " while the stored ingredient uses the " + ingredientStored.getUnit() + " unit.";
                throw new RuntimeException(message);
            }
        } else {
            ingredients.put(ingredient.getName(), ingredient);
            return ingredient;
        }
    }

    @Override
    public void collectIngredient(String name, int amount) {
        Ingredient ingredientStored = ingredients.get(name);
        if (ingredientStored != null) {
            if (ingredientStored.getAmount() - amount >= 0) {
                ingredientStored.setAmount(ingredientStored.getAmount() - amount);
            } else {
                throw new RuntimeException("Not enough "+ingredientStored.getName()+". Supply only contains "+ingredientStored.getAmount()+" "+ingredientStored.getUnit());
            }

        } else {
            String message = String.format("No supply of '%s' registered", name);
            throw new RuntimeException(message);
        }
    }
}
