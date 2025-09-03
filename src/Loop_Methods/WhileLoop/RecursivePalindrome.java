//WAJP to check given string is Palindrome oor not by recursive function
import java.util.Scanner;

class RecursivePalindrome {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter String");
        String str = input.next();

        boolean palindrome=isPalindrome(str);
        System.out.println(palindrome?"It's Palindrome":"It's not Palindrome");
}
        public static boolean isPalindrome(String str){
        if(str.length()<=1){
            return true;
        }
        int lastStr=str.length()-1;
        if(str.charAt(0)!=str.charAt(lastStr)){
            return false;
        }
        return true;
        }
}
