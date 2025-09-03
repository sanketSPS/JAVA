//WAJP to find number in 2D Array
import java.util.Scanner;

class Search2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number of rows:");
        int rows = input.nextInt();
        System.out.println("Please enter number of columns:");
        int cols = input.nextInt();
        int[][] myArr = new int[rows][cols];

        int i = 0;
        while (i < rows) {
            int j = 0;
            while (j < cols) {
                System.out.print("Please enter row:" + (i + 1) + ",Column" + (j + 1) + " :");
                myArr[i][j] = input.nextInt();
                j++;
            }
            i++;
        }
        System.out.println("Enter number you want to search:");
        int num = input.nextInt();

        boolean found = isFound(myArr, num);
        if (found) {
            System.out.println("Your number is in array");
        } else {
            System.out.println("Your number is not in array");
        }
    }
    public static boolean isFound(int[][] myArr,int num){
        int i=0;
        while (i<myArr.length){
            int j=0;
            while (j<myArr[i].length){
                if (myArr[i][j]==num){
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}
