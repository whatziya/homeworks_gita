package lesson_7.Car;

public class Car {
    int weight;
    int fuel;
    int breakingDistance;

    public Car(int weight, int fuel, int breakingDistance) {
        this.weight = weight;
        this.fuel = fuel;
        this.breakingDistance = breakingDistance;
    }
    void showInfo(){
        System.out.println("Weight: " + weight);
        System.out.println("Fuel: " + fuel);
        System.out.println("Breaking Distance: " + breakingDistance);
    }
}
