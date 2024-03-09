package lesson_11.abstraction_uchun_masalalar;


public class Rectangle extends Shape{
    public Rectangle(int a, int b){
        super(a,b);
    }

    @Override
    public void getPerimeter(){
        System.out.println(2*(getA() + getB()));
    }

    @Override
    void getSurface() {
        System.out.println(getA() * getB());
    }

    @Override
    void getSideCount() {
        System.out.println(2);
    }
}
