import java.util.Scanner;

class Swap {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        /*
        By declaring variable
        int a=10;
        int b=20;
        int c;
        c=a;
        a=b;
        b=c;
        System.out.println("swapping a: "+a);
        System.out.println("swapping b: "+b);
        //System.out.println(b);
         */
        System.out.println("Enter num1:");
        int Num1=input.nextInt();
        System.out.println("Enter num2:");
        int Num2=input.nextInt();
        int Num3;
        Num3=Num1;
        Num1=Num2;
        Num2=Num3;
        System.out.println("swapping Num1: "+Num1);
        System.out.println("swapping Num2: "+Num2);
        /*
        Without taking 3rd variable
        Num1=Num1+Num2;
        Num2=Num1-Num2;
        Num1=Num1-Num2;
         */
    }
}
