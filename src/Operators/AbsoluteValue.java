import java.util.Scanner;

//WAJP to calculate absolute value if given integer
class AbsoluteValue {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter the number:");
        int num=input.nextInt();
        int res=num>=0 ? num : -num;
        System.out.println("Absolute value is:"+res);
    }
}
