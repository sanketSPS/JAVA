import java.util.Scanner;

class Simpleinterest {
    public static void main(String[] args) {
        Scanner interest=new Scanner(System.in);
        System.out.println("Enter principle:");
        int principle =interest.nextInt();
        System.out.println("Enter interest rate:");
        float rate=interest.nextFloat();
        System.out.println("Enter Time:");
        int time=interest.nextInt();
        float simple_interest=(principle *time *rate)/100;
        System.out.println("Simple Interest is:"+simple_interest);
    }
}
