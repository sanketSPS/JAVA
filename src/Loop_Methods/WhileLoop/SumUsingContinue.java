//WAJP to using continue and while loop to sum all positive numbers entered by user skip negative numbers
package WhileLoop;

import java.util.Scanner;

public class SumUsingContinue {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int size = input.nextInt();
        int[] myArr = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("Please enter element " + (i + 1) + " :");
            myArr[i] = input.nextInt();
            i++;
        }

        int sum=sum(myArr);
        System.out.println("Sum of Positive Elements are:"+sum);
    }

    public static int sum(int[] myArr){
        int i=0;
        int sum=0;
        while (i<myArr.length){
            if(myArr[i]<0){
                i++;
                continue;
            }
            sum=sum+myArr[i];
            i++;
        }
        return sum;
    }

}
