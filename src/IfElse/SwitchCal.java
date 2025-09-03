import java.util.Scanner;

//WAJP to create a simple calculator
class SwitchCal {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to calculator");
        System.out.println("Press + for Addition");
        System.out.println("Press - for Subtraction");
        System.out.println("Press * for Multiplication");
        System.out.println("Press / for Division");
        char ch=input.next().charAt(0);


        if(ch=='+'||ch=='-'||ch=='*'||ch=='/') {
            System.out.print("Please enter num1:");
            int a = input.nextInt();
            System.out.print("Please enter num2:");
            int b = input.nextInt();

            switch (ch) {
                case '+':
                    System.out.println("Addition is: " + (a + b));
                    break;
                case '-':
                    System.out.println("Subtraction is: " + (a - b));
                    break;
                case '*':
                    System.out.println("Multiplication is: " + a * b);
                    break;
                case '/':
                    System.out.println("Division is: " + a / b);
                    break;
            }
        }
        else{
                System.out.println("Please enter valid input");
        }
    }
}
