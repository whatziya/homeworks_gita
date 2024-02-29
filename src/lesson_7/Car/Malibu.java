package lesson_7.Car;

public class Malibu extends Car{
    public Malibu(int weight, int fuel, int breakingDistance) {
        super(weight, fuel, breakingDistance);
    }
    @Override
    void showInfo(){
        System.out.println("Weight: " + weight);
        System.out.println("Fuel: " + fuel);
        System.out.println("Breaking Distance: " + breakingDistance);
    }
}
