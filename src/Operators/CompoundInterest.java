import java.util.Scanner;

class CompoundInterest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter principle:");
        int principle =input.nextInt();
        System.out.println("Enter interest rate:");
        float rate=input.nextFloat();
        System.out.println("Enter duration:");
        int time=input.nextInt();
        double compound_intrest= principle*(Math.pow((1+rate/100),time));
        System.out.println("Compound Interest is:"+compound_intrest);
    }
}
