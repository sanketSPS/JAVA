package WhileLoop;//WAJP to calculate the sum of digits of an given number
import java.util.Scanner;

class Sum0fDigit {
    public static void main(String[] args) {
        System.out.println("Sum of digit is:"+sum());;
    }
    public static int sum(){
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter numbers:");
        int num= input.nextInt();
        int sum=0;
        while (num>0){
            int digit=num%10; //It will give last digit
            sum=sum+digit;//It will add last digit
            num=num/10; //It will remove last digit
        }
        return sum;
    }
}
