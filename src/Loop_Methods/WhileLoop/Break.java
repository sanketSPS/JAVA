//WAJP using break to read inputs from user in a loop and break the loop if a specific keyword (like"exit: is entered..
package WhileLoop;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while (true) {
            System.out.println("Please enter a string");
            String ch=input.next();
            if (ch.equals("exit")){
                break;
            }
        }
    }
}
