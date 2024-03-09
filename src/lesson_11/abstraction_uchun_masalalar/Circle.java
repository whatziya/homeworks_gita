package lesson_11.abstraction_uchun_masalalar;

public class Circle extends Shape{
    public Circle(int a){
        super(a);
    }

    @Override
    void getPerimeter() {
        System.out.println(2 * Math.PI * getA());
    }

    @Override
    void getSurface() {
        System.out.println(Math.PI * getA() * getA());
    }

    @Override
    void getSideCount() {
        System.out.println(1);
    }


}
