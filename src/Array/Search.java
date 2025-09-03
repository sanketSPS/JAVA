//WAJP to search number in array
import java.util.Scanner;

class Search {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       // int[] myArr=ArrayFunction.arrayCreation();
        System.out.println("Enter the number of elements:");
        int size= input.nextInt();
        int[] myArr=new int[size];
        int i=0;
        while (i<size){
            System.out.print("Please enter element "+(i+1)+" :");
            myArr[i]=input.nextInt();
            i++;
        }
        System.out.println("Enter number to search:");
        int num= input.nextInt();
        boolean isFound=isFound(myArr,num);
        if(isFound){
            System.out.println(num+" is present in array");
        }
        else {
            System.out.println(num+" is not present in array");
        }
    }
    public static boolean isFound(int[] myArr, int num){
        int index=0;
        while (index < myArr.length) {
            if (myArr[index] == num) {
                return true;
            }
            index++;
        }
            return false;
        }
    }

