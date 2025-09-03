package WhileLoop;

import java.util.Scanner;

class WhileLoop {
    public static void main(String[] args) {
        //Print number 1 to 10
        int i=1;
        while (i<=10){
            System.out.println(i++);
        }

        //Print reverse numbers 50 to 40
        int num1=50;
        while(num1>=40){
            System.out.println(num1--);
        }

        //Take 5 numbers from user and display
        Scanner input=new Scanner(System.in);
        int num=1;//Initializing space to store input
        System.out.println("Please Enter numbers:");
        while (num<=5)//Condition//
            {
            int num2= input.nextInt();//Accepting input
            System.out.println("Your number is:"+num2);
            num++;//Incrementing space to store input
        }
    }
}
