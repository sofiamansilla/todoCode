package claabstracts;

public class Square extends Figure{

    private double side;

    public Square() {
    }

    public Square(double x, double y, double side) {
        super(x, y);
        this.side = side;
    }

    @Override
    public double calculateArea() {

        return side * side;
    }

}
