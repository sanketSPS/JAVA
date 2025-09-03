import java.util.Scanner;

//WAJP to print multiplication table
class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter a number you want to table:");
        int num= input.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num+" * "+i+" = "+num*i);
        }
    }
}
