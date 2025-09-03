import java.util.Scanner;

class Circle {
    double radius;
    //final double PI=3.14;

    Circle(double radius){
        this.radius=radius;
    }

    double circumference(){
        return 2*Math.PI*radius;
    }

    double area(){
        return Math.PI*Math.pow(radius,2);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter radius");
        double radius=input.nextDouble();
        //Circle c1=new Circle(4);
        Circle c1=new Circle(radius);
        System.out.println("Circumference:"+c1.circumference());
        System.out.println("Area:"+c1.area());
    }
}
