package lesson_16.Shape;

public class Circle implements Shape{
    private int radius;
    Circle(int radius){
        this.radius = radius;
    }
    @Override
    public double getPerimeter() {
        return 2 * Math.PI *radius;
    }

    @Override
    public double getSurface() {
        return Math.PI * radius * radius;
    }
}
