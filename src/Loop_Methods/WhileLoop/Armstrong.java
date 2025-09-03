package WhileLoop;//WAJP to check given number is WhileLoop.Armstrong or not
import java.util.Scanner;

class Armstrong {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=input.nextInt();
        boolean armstrong=isarm(num);
        if (armstrong){
            System.out.println("Number is armstrong");
        }
        else
        {
            System.out.println("Number is not armstrong");
        }
    }

    public static boolean isarm(int num){
        int digits=digit(num);
        int finalNumber=0;
        int num1=num;
        while (num>0) {
            int lastDigit = num % 10;
            num /= 10;
            finalNumber += pow(lastDigit, digits);
        }
        return finalNumber==num1;
    }

    public static int digit(int num){
        int digits=0;
        while (num>0){
            digits++;
            num/=10;
        }
        return digits;
    }

    public static int pow(int num1, int num2){
        int result=1;
        int i=0;
        while (i<num2){
            result *=num1;
            i++;
        }
        return result;
    }
}
