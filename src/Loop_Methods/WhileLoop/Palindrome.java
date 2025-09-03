package WhileLoop;//WAJP to verify if a number is palindrome
import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number:");
        int num = input.nextInt();
        boolean pailndrome=isPalindrome(num);
        if (pailndrome){
            System.out.println("Number is palindrome");
        }else System.out.println("Number is not palindrome");
    }

    public static boolean isPalindrome(int num){
        int rev= Reverse.reverse(num);//We have call method from another class file which is present already
        return num==rev; //true
    }
    /*
    public static int reverse(int num){
        int reverse=0;;
        while (num>0){
            int digit=num%10; //It will give last digit
            reverse=reverse*10+digit;//It will add last digit
            num=num/10; //It will remove last digit
        }
        return reverse;
    }
    */
}
