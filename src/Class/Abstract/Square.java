package Abstract;

public class Square extends Shape {
    private final double side;
    @Override
    public double calculateArea() {
        return Math.pow(side,2);
    }

    public Square(double side) {
        this.side = side;
    }
}
