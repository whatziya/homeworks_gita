package Shape;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        Shape square = new Square(5);

        System.out.println("Area of rectangle: " + rectangle.area());
        System.out.println("Area of square: " + square.area());
    }
}
