package lesson_9.Parking;

public class Testga {
    public static void main(String[] args) {
        Parking p = new Parking(5);
        Car c1 = new Car("L", 123);
        Car c2 = new Car("L", 124);
        Car c3 = new Car("L", 125);
        Car c4 = new Car("L", 126);
        Car c5 = new Car("L", 127);
        Car c6 = new Car("L", 128);
        Car[] cars = {c1, c2, c3, c4, c5};
        p.addCar(cars);
        p.show();
    }
}
