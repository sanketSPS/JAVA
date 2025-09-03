package WhileLoop;//WAJP to reverse the given number
import java.util.Scanner;

class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number:");
        int num = input.nextInt();
        int reverse = reverse(num);
        System.out.println("Reserve of number is: "+reverse);
    }

    public static int reverse(int num){
        int reverse=0;;
        while (num>0){
            int digit=num%10; //It will give last digit
            reverse=reverse*10+digit;//It will add last digit
            num=num/10; //It will remove last digit
        }
        return reverse;
    }
}
