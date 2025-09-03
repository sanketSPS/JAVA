import java.util.Scanner;

class ifelse5 {
    public static void main(String[] args) {
        System.out.println("To check leap year");
        Scanner input=new Scanner(System.in);
        System.out.println("Enter year");
        int year= input.nextInt();

        if(year%400==0 ||(year%4==0 && year%100!=0)){
            System.out.println("Enter year is leap year");
        }
        else {
            System.out.println("Enter year is not leap year");
        }
    }
}
