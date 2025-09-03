//WAJP to print factorial using recursive function

import java.util.Scanner;

public class FactorialRecursive {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter number");
        int num=input.nextInt();
        long fact=fact(num);
        System.out.println("Factorial:"+fact);
    }
    public static long fact(int num){
        if(num==1){
            return 1;
        }
        return num*fact(num-1);
    }
}
