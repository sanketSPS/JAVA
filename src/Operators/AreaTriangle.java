import java.util.Scanner;

class AreaTriangle {
    public static void main(String[] args) {
        Scanner area=new Scanner(System.in);
        System.out.println("Enter Base:");
        double base=area.nextDouble();
        System.out.println("Enter Height:");
        double height=area.nextDouble();
        double Area=0.5*base*height;
        System.out.println("Area of Triangle is:"+Area);
    }
}
