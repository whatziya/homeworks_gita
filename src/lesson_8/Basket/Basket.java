package lesson_8.Basket;

public class Basket {
    double maxWeight;
    double currentWeight;
    Fruit[] fruits;

    public Basket(double maxWeight) {
        this.maxWeight = maxWeight;
        this.currentWeight = 0;
        this.fruits = new Fruit[0];
    }
    boolean isFull(){
        return currentWeight >= maxWeight;
    }
    boolean isEmpty(){
        return currentWeight == 0;
    }
    void showMessage(String message){
        System.out.println(message);
    }
    void addFruit(Fruit fruit){
        if(!isFull()) {
            if(currentWeight + fruit.weight <= maxWeight){
                currentWeight += fruit.weight;
                Fruit[] newFruits = new Fruit[fruits.length + 1];
                System.arraycopy(fruits, 0 , newFruits,0,fruits.length);
                newFruits[fruits.length] = fruit;
                fruits = newFruits;
            } else {
                showMessage("The basket is full. Cannot add more fruits");
            }
        } else {
            showMessage("The basket is full. Cannot add more fruits");
        }
    }
    void addFruits(Fruit[] newFruits){
        double totalWeight = 0;
        for(Fruit fruit: newFruits){
            totalWeight += fruit.weight;
        }
        if(currentWeight + totalWeight <= maxWeight){
            for(Fruit fruit : newFruits){
                addFruit(fruit);
            }
        } else{
            showMessage("Cannot add fruits. Exeeds maximum weight by " + (currentWeight + totalWeight - maxWeight));
        }
    }
    void showFruits(){
        if(!isEmpty()){
            for(Fruit fruit : fruits){
                System.out.println("Name: " + fruit.name + ", Color: " + fruit.color + ", Weight: " + fruit.weight);
            }
        } else {
            showMessage("The basket is empty");
        }
    }
}
