package abstraction;

public class Rectangle extends Shape{

    public Rectangle(double a, double b) {
        super(a, b);
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
