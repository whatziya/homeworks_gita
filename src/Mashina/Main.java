package Mashina;

public class Main {
    public static void main(String[] args) {
        Parent parentCar = new Parent("CAR123");
        parentCar.drive();  // CAR123 toifasini hayday oladi

        // Bolaning obyekti
        Child1 childCar = new Child1("CAR456", "GPS");
        childCar.drive();  // CAR456 toifasini hayday oladi
        childCar.driveWithAdditionalFeature();
    }
}
