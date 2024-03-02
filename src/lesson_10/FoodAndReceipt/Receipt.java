package lesson_10.FoodAndReceipt;

import java.util.ArrayList;
import java.util.List;

public class Receipt {
    private final int RECEIPT_COUNT = 20;
    private List<Ingredient> ingredients;

    public Receipt() {
        ingredients = new ArrayList<>();
    }

    public boolean addIngredient(Ingredient ingredient, int quantity) {
        if (isFull()) {
            System.out.println("Receipt is full.");
            return false;
        }

        for (int i = 0; i < quantity; i++) {
            ingredients.add(ingredient);
        }

        System.out.println("Ingredients added.");
        return true;
    }

    public boolean isFull() {
        return ingredients.size() >= RECEIPT_COUNT;
    }

    public boolean isEmpty() {
        return ingredients.isEmpty();
    }

    public void show() {
        System.out.println("Ingredients in the receipt: " + ingredients.toString());
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }
}
