package lesson_11.home2;

public class Rectangle extends Shape{


    public Rectangle(int a, int b) {
        super(a, b);
    }

    @Override
    void getPerimeter() {
        System.out.println(2 * (getA() + getB()));
    }

    @Override
    void getSurface() {
        System.out.println(getA() * getB());
    }
}
