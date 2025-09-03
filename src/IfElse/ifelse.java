//WAJP to check you are valid for driving license
import java.util.Scanner;

class ifelse {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int Age=input.nextInt();

        if(Age>=18)
        {
            System.out.println("You are eligible for driving license");
        }
        else
        {
            System.out.println("Sorry, You are not eligible");
        }
    }
}
