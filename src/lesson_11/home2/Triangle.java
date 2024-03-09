package lesson_11.home2;

public class Triangle extends Shape{

    public Triangle(int a, int b, int c) {
        super(a, b, c);
    }

    @Override
    void getPerimeter() {
        System.out.println(getA() + getB() + getC());
    }

    @Override
    void getSurface() {
        int half = (getA() + getB() + getC()) / 2;
        System.out.println(half * (half - getA()) * (half - getB()) * (half - getC()));
    }
}
