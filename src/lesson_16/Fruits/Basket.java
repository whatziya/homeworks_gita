package lesson_16.Fruits;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    final int MAX_WEIGHT;
    private int currectWeight = 0;
    List<Fruit> fruits;

    public Basket(int maxWeight) {
        MAX_WEIGHT = maxWeight;
        this.fruits = new ArrayList<>();
    }

    public boolean isEmpty(){
        return fruits.size() == 0;
    }
    public boolean isFull(){
        return currectWeight >= MAX_WEIGHT;
    }
    public boolean addFruit(Apple apple){
        if (isFull() || (currectWeight + apple.getWeight()) > MAX_WEIGHT) {
            System.out.println("Cannot add apple. Basket is full.");
            return false;
        }
        fruits.add(apple);
        currectWeight += apple.getWeight();
        return true;
    }

    public boolean addFruit(Peach peach){
        if (isFull() || (currectWeight + peach.getWeight()) > MAX_WEIGHT) {
            System.out.println("Cannot add peach. Basket is full.");
            return false;
        }
        fruits.add(peach);
        currectWeight += peach.getWeight();
        return true;
    }

    public boolean addFruit(Pomegranate pomegranate){
        if (isFull() || (currectWeight + pomegranate.getWeight()) > MAX_WEIGHT) {
            System.out.println("Cannot add pomegranate. Basket is full.");
            return false;
        }
        fruits.add(pomegranate);
        currectWeight += pomegranate.getWeight();
        return true;
    }
    public int getEmptySize(){
        return MAX_WEIGHT - currectWeight;
    }
    public boolean addFruits(Fruit[] fruitList) {
        if (fruitList == null || fruitList.length == 0) {
            return false;
        }

        int totalWeight = 0;
        for (Fruit fruit : fruitList) {
            if (fruit != null) {
                totalWeight += fruit.getWeight();
            }
        }

        if (getEmptySize() < totalWeight) {
            return false;
        }

        for (Fruit fruit : fruitList) {
            if (fruit != null) {
                fruits.add(fruit);
            }
        }

        currectWeight += totalWeight;
        return true;
    }

    public int getCurrectWeight() {
        return currectWeight;
    }
}
