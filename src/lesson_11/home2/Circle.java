package lesson_11.home2;

public class Circle extends Shape{

    public Circle(int a) {
        super(a);
    }

    @Override
    void getPerimeter() {
        System.out.println(2*Math.PI*getA());
    }

    @Override
    void getSurface() {
        System.out.println(Math.PI * getA() * getA());
    }


}
