//WAJP to find password checker until a correct password is enter
import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        System.out.println("Welcome to password checker");
        Scanner input=new Scanner(System.in);
       int pass=1234;
       int pass1;
        do {
            System.out.println("Please enter the password:");
            pass1=input.nextInt();

            if(pass1!=pass){
                System.out.println("Incorrect Pin");
            }
        }
        while (pass1!=pass);
        System.out.println("Corect");
    }
}
