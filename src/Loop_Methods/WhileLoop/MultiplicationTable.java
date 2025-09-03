package WhileLoop;//WAJP that prints the multiplication table for a given number
import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        //Program that prints multiplication table of user given table
        Scanner input=new Scanner(System.in);
        int i=1;
        System.out.println("Please enter the table number");
        int num= input.nextInt();
        System.out.println("Multiplication Table of:"+num );

        while (i<=10){
            int table=num*i;
            System.out.println(table);
            i++;
        }
    }
}
