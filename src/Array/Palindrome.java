//WAJP to check array is palindrome or not
import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] myArr=ArrayFunction.arrayCreation();
//        System.out.println("Enter the number of elements:");
//        int size= input.nextInt();
//        int[] myArr=new int[size];
//        int i=0;
//        while (i<size){
//            System.out.print("Please enter element "+(i+1)+" :");
//            myArr[i]=input.nextInt();
//            i++;
//        }
        ArrayFunction.displayArray(myArr);
        boolean pailndrome=isPalindrome(myArr);
        if (pailndrome){
            System.out.println("Array is palindrome");
        }else System.out.println("Array is not palindrome");
    }

    public static boolean isPalindrome(int[] myArr){
        int i=0;
        while (i< myArr.length/2){
            if(myArr[i]!=myArr[myArr.length-1-i]){
                return false;
            }
            i++;
        }
        return true;
    }

}
