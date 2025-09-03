import java.util.Scanner;

class Perimeter {
    public static void main(String[] args) {
        Scanner rect=new Scanner(System.in);
        System.out.println("Enter Rectangle length:");
        int a=rect.nextInt();
        System.out.println("Enter Rectangle Breath:");
        int b=rect.nextInt();
        int Peri=a*2+b*2;
        // int Peri=2*(a+b);
        System.out.println("Perimeter of Rectangle is:"+Peri);
    }
}
