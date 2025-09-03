package WhileLoop;//WAJP to find the least common multiple (WhileLoop.LCM) of two numbers
import java.util.Scanner;

class LCM {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter num1:");
        int num1= input.nextInt();
        System.out.println("Enter num2:");
        int num2= input.nextInt();
        int lcm=lcm(num1,num2);
        System.out.println("WhileLoop.LCM is: "+lcm);
    }
    public static int lcm(int num1,int num2){
        int i=1;
        while (i <= num2){
            int factorial=num1*i;
            if(factorial % num2==0){
                return factorial;
            }
            i++;
        }
        return 0;
        }
    }

