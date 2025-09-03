import java.util.Scanner;

class OddAvg {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number");
        int num=input.nextInt();
        int sum=0;
        int sumOdd=0;
        int count=0;
        while (num>0){
            int digit=num%10;
            if(digit%2!=0) {
                count++;
                sumOdd += digit;
            }
            num/=10;
            }
        System.out.println("Sum is:"+sumOdd);
        System.out.println("Avg is:"+(sumOdd/count));
        }

    }

