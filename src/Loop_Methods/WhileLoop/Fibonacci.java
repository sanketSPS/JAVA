package WhileLoop;//WAJP to print fibonacci series
import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the number:");
        int num= input.nextInt();
        System.out.println("WhileLoop.Fibonacci series is: ");
        fibonacci(num);
    }
    public static void fibonacci(int num){
        if (num<0) return;
            System.out.println("0");
        if (num==0) return;
            System.out.println("1");

        int first=0, second=1;
        while (first+second<=num){
            int third=first+second;
            System.out.println(third+" ");
            first=second;
            second=third;
        }
    }
}
