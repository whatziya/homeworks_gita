package lesson_11.abstraction_uchun_masalalar;

public abstract class Shape {
    private int a;
    private int b;

    public Shape(int a) {
        this.a = a;
    }

    public Shape(int a, int b) {
        this.a = a;
        this.b = b;
    }

    abstract void getPerimeter();
    abstract void getSurface();
    abstract void getSideCount();

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
