package lesson_10.FoodAndReceipt;

import java.util.ArrayList;
import java.util.List;

public class Food {
    Receipt receipt;
    List<Ingredient> ingredientList;

    public Food(Receipt receipt) {
        this.receipt = receipt;
        this.ingredientList = new ArrayList<>();
    }
    boolean add(Ingredient ingredient){
        return ingredientList.add(ingredient);
    }
//    int getCount(){
//        List<Ingredient> ingF = new ArrayList<>(receipt.getIngredients());
//        List<Integer> count_of= new ArrayList<>();
//        for (Ingredient ingredient : ingF) {
//            int count = 1;
//            for(Ingredient ingredient1 : ingF){
//                if(ingredient1.equals(ingredient)){
//                    count++;
//                }
//            }
//            int current_count = 1;
//            for(Ingredient ingredient1: ingredientList){
//                if(ingredient1.equals(ingredient)){
//                    current_count++;
//                }
//            }
//            count_of.add(current_count / count);
//        }
//        int min = count_of.get(0);
//
//        for (int i = 1; i < count_of.size(); i++) {
//            if (count_of.get(i) < min) {
//                min = count_of.get(i);
//            }
//        }
//        return min;
//    }
//    int getCount(){
//        // Assuming the receipt's ingredients are unique
//        int minCount = Integer.MAX_VALUE;
//
//        for (Ingredient receiptIngredient : receipt.getIngredients()) {
//            int receiptIngredientCount = 0;
//            for (Ingredient foodIngredient : ingredientList) {
//                if (receiptIngredient.equals(foodIngredient)) {
//                    receiptIngredientCount++;
//                }
//            }
//            minCount = Math.min(minCount, receiptIngredientCount);
//        }
//        return minCount;
//    }
    public int getCount() {
        int maxCount = Integer.MAX_VALUE;
        for (Ingredient receiptIngredient : receipt.getIngredients()) {
            int receiptIngredientCount = 0;
            for (Ingredient foodIngredient : ingredientList) {
                if (receiptIngredient.equals(foodIngredient)) {
                    receiptIngredientCount++;
                }
            }
            int maxFoodsFromIngredient = receiptIngredientCount;
            if (maxFoodsFromIngredient < maxCount) {
                maxCount = maxFoodsFromIngredient;
            }
        }
        return maxCount;
    }
    void getReceipt(){
        receipt.show();
    }
    boolean hasFood(){
        return getCount() >= 1;
    }
}
