import java.util.Scanner;

class Prime {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a number");
        int num= input.nextInt();
        boolean prime=isPrime(num);
        if (prime){
            System.out.println("Number is Prime");
        }else System.out.println("Number is not prime");

    }
    public static boolean isPrime(int num){
        for (int i=2;i<num;i++){
            if (num%i==0){
                return false;
            }
        }
        return true;
    }
}
