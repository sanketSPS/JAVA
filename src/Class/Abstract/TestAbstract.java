package Abstract;

public class TestAbstract {
    public static void main(String[] args) {
        Circle c=new Circle(4.5);
        System.out.println("Area of Circle: "+c.calculateArea());
        Square s=new Square(6.5);
        System.out.println("Area of Square: "+s.calculateArea());
    }
}
