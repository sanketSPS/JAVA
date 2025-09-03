//WAJP to print Fibonacci Series by recursive series
import java.util.Scanner;

public class FibonacciRecursive {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter number");
        int num=input.nextInt();
        System.out.println("Fibonacci series:");
        for(int i=1;i<=num;i++) {
            System.out.println(fibonacci(i));
        }
    }
    public static int fibonacci(int num){
        if(num==1){
            return 0;
        }
        if (num==2) {
            return 1;
        }
        return (fibonacci(num-1)+fibonacci(num-2));
    }
}

