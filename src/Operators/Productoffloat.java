import java.util.Scanner;

class Productoffloat {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the floating number1:");
        float num1=scan.nextFloat();
        System.out.println("Enter the floating number2:");
        float num2=scan.nextFloat();
        float result=num1*num2;
        System.out.println("Product of floating values are:"+result);
    }
}

