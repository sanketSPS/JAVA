import java.util.Scanner;

class Arithmatic {
    public static void main(String[] args) {
        //Addition operator
        System.out.println(10+20);
        System.out.println('C'+"A");
        System.out.println("Hello"+20);
        System.out.println(10+"Hi");
        System.out.println('a'+10);
        System.out.println("Hello"+21+'a');
        System.out.println("Hello"+2*10);
        System.out.println(21+"bye"+2);
        System.out.println("true"+false);
        System.out.println("true"+"false");
        System.out.println(true+"hi"+10);
        System.out.println(true+"false");

        //Substraction operator
        System.out.println(10-5);
        System.out.println('a'-10);

        //Multiplcation
        System.out.println(10*2);

        //divisio
        System.out.println(20/2);

        //Modulas== It will show remaindar
        System.out.println(10%2);
        System.out.println(9%2);

        Scanner input=new Scanner(System.in);
        System.out.println("Enter number1:");
        int num1= input.nextInt();
        System.out.println("Enter number2:");
        int num2=input.nextInt();
        System.out.println(num1+num2);
        System.out.println(num1-num2);
        System.out.println(num1*num2);
        System.out.println(num1/num2);
    }
}
