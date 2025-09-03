import java.util.Scanner;

public class ConcatinateString {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter string 1:");
        String str1=input.next();
        System.out.print("Enter string 2:");
        String str2=input.next();
        String str3=str1.concat(str2);
        System.out.println(str3.toUpperCase());
    }
}
