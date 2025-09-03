import java.util.Scanner;

class ifelse4 {
    public static void main(String[] args) {
        System.out.println("To check Greater of three");
        Scanner input=new Scanner(System.in);
        System.out.println("Enter num1");
        int num1= input.nextInt();
        System.out.println("Enter num2");
        int num2= input.nextInt();
        System.out.println("Enter num3");
        int num3= input.nextInt();

        if (num1>num2 && num1>num3){
            System.out.println(num1+" is greater");
        } else if (num2>num1 && num2>num3) {
            System.out.println(num2+" is greater");
        }else {
            System.out.println(num3+" is greater");
        }
    }
}
