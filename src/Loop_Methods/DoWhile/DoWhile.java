import java.util.Scanner;

class DoWhile {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int age;
        do {
            System.out.println("Please enter your age:");
            age=input.nextInt();
        }
        while (age<0 || age>100);
        System.out.println("Your age is:"+age);

    }
}
