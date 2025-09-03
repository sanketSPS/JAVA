package WhileLoop;//WAJP to calculate factorial
import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num= input.nextInt();
        long fact=factorial(num);
        System.out.println("WhileLoop.Factorial of number is:"+fact);
    }

    public static long factorial(int num){
        if(num<2)
        {
            return 1;
        }
        long fact=1;
        int i=2;
        while (i<=num){
            fact*=i;//fact=fact*i;
            i++;
        }
        return fact;
    }
}
