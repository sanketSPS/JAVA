//WAJP to find minimum of 2 numbers
import java.util.Scanner;

class MinTernaryOp {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please Enter num1:");
        int num1= input.nextInt();
        System.out.print("Please Enter num2:");
        int num2=input.nextInt();
        int min= num1<num2 ? num1 : num2;
        //System.out.println(num1<num2 ? num1+" is Minimum number" : num2+" is Minimum number");
        System.out.println(min+" is Minimum number");
    }
}
