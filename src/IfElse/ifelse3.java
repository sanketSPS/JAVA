import java.util.Scanner;

class ifelse3 {
    public static void main(String[] args) {
        System.out.println("To check number is odd or even");
        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter number");
        int num= input.nextInt();

        if (num%2==0){
            System.out.println("Enter number is Even");
        }else {
            System.out.println("Enter number is odd");
        }
    }
}
