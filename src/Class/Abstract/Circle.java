package Abstract;

public class Circle extends Shape {
    private final double radius;
    @Override
    public double calculateArea() {
        return Math.PI*Math.pow(radius,2);
    }

    public Circle(double radius) {
        this.radius = radius;
    }
}
