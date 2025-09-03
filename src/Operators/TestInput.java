import java.util.Scanner;
class TestInput
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = input.nextLine();
        System.out.println("Hello "+name);

        System.out.println("Add 2 numbers by taking input");
        System.out.println("Enter 1st number:");
        int Num1 = input.nextInt();
        System.out.println("Enter 2nd Number:");
        int Num2 = input.nextInt();
        int addition=Num1+Num2;
        System.out.println("Addition is:"+addition);
    }
}
