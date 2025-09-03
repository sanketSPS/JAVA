import java.util.Scanner;

//WAJP to print given number is Odd or Even
class EvenOddTernary {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the number:");
        int num=input.nextInt();
        String res=num%2==0 ? num+" is Even" : num+" is Odd";
        System.out.println(res);
    }
}
