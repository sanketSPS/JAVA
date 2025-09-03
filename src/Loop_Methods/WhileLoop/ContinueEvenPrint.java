//WAJP using continue to print only even numbers using continue for odd numbers
package WhileLoop;

import java.util.Scanner;

public class ContinueEvenPrint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int size = input.nextInt();
        int[] myArr = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("Please enter element " + (i + 1) + " :");
            myArr[i] = input.nextInt();
            i++;
        }
        even(myArr);
    }

    public static void even(int[] myArr) {
        int i = 0;
        while (i < myArr.length) {
            if (myArr[i] % 2 != 0) {
                i++;
                continue;
            } else {
                System.out.println(myArr[i]);
            }
            i++;
        }

    }
}
