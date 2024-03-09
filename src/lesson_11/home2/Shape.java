package lesson_11.home2;

public abstract class Shape {
    private int a;
    private int b;
    private int c;

    public Shape(int a) {
        this.a = a;
    }

    public Shape(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Shape(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    abstract void getPerimeter();
    abstract void getSurface();

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
}
