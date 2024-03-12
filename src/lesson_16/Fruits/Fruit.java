package lesson_16.Fruits;

import javax.lang.model.element.Name;

public abstract class Fruit {
    String name;
    String color;
    int weight;
    Fruit(String name, String color, int weight){
        this.name = name;
        this.color = color;
        this.weight = weight;
    }
    final void showInfo(){
        System.out.println("Name: " + name + "\nColor " + color + "\nWeight" + weight);
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }
}
