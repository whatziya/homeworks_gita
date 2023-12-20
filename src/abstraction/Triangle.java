package abstraction;

public class Triangle extends Shape{
    public Triangle(double a, double b, double c){
        super(a, b, c);
    }

    @Override
    public double getPerimeter() {
        return getA() * getB() * getC();
    }

    @Override
    public double getArea() {
        double halfPR = getPerimeter() / 2;
        return Math.sqrt(halfPR * (halfPR - getA()) * (halfPR - getB()) * (halfPR - getC()));
    }


}
