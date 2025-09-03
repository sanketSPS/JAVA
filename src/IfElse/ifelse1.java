//WAJP for bus ticket discount
import java.util.Scanner;

class ifelse1 {
    public static void main(String[] args) {
        //Bus ticket discount
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your age:");
        int age= input.nextInt();
        System.out.println("Are you female (true/false):");
        boolean female=input.nextBoolean();

        if (age<=5){
            System.out.println("You are eligible for 75% Discount");
        } else if (age>=60 || female) {
            //female==true
            System.out.println("You are eligible for 50% Discount");
        }else {
            System.out.println("Sorry, You don't have discount");
        }

    }
}
