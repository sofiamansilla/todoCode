package claabstracts;

public class Circle extends Figure{

    private double radius;

    public Circle() {
    }

    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        double pi = 3.14;
        return pi * radius * radius;
    }

    public double getRadius() {
        return radius;
    }
}
