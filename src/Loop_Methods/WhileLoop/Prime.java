package WhileLoop;//WAJP to check number is prime or not
import java.util.Scanner;

class Prime {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the number:");
        int num= input.nextInt();
        boolean prime=isPrime(num);
        if(prime){
            System.out.println(num+" is  a prime number");
        }else System.out.println(num+" is not a prime number");
    }

    public static boolean isPrime(int num){
        int i=2;
        while (i<num){
            if (num%i==0){
                return false;
            }
            i++;
        }
        return true;
    }
}
