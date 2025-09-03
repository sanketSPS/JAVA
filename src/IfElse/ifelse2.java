import java.util.Scanner;

class ifelse2 {
    public static void main(String[] args) {
        System.out.println("To check if a number is positive, negative or zero");
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number");
        int num= input.nextInt();
        if (num==0){
            System.out.println("Enter number is zero");
        } else if (num>0) {
            System.out.println("Enter number is Positive");
        }else {
            System.out.println("Enter number is Negative");
        }
    }
}
