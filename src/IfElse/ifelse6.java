import java.util.Scanner;

class ifelse6 {
    public static void main(String[] args) {
        System.out.println("Grade System");
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your marks");
        int grade= input.nextInt();

        if (grade>=90){
            System.out.println("You have A Grade");
        } else if (grade>=75) {
            System.out.println("You have B Grade");
        } else if (grade>=60) {
            System.out.println("You have C Grade");
        } else if (grade>=30) {
            System.out.println("You have D Grade");
        }else {
            System.out.println("You are failed");
        }
    }
}
