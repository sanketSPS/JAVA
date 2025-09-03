package WhileLoop;//WAJP to sum of all odd numbers from 1 to a specific number N
import java.util.Scanner;

class SumofOdd {
    public static void main(String[] args) {
        //Sum of all odd numbers from 1 to specified number N
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the number:");
        int num= input.nextInt();
        int sum=sum(num);
        System.out.println("Sum of odd num:"+sum);
    }

    public static int sum(int num){
        int sum=0;
        int i=1;
        while(i<=num){
            sum+=i;
            i+=2;
        }
        return sum;
    }
}
