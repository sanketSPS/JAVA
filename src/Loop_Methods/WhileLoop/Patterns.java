package WhileLoop;//WAJP to print pattern
import java.util.Scanner;

class Patterns {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter number of rows::");
        int rows= input.nextInt();
        rightHalfPyramid(rows);
        reverseRightHalfPyramid(rows);
        leftHalfPyramid(rows);
    }

    public static void rightHalfPyramid(int rows) {
        System.out.println("Right Half Pyramid");
        int row = 0;
        while (row < rows) {
            System.out.print("*");
            int i = 0;
            while (i < row) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            row++;
        }
    }

    public static void reverseRightHalfPyramid(int rows) {
        System.out.println();
        System.out.println("Reverse Right Half Pyramid");
        int row = rows;
        while (row > 0) {
            int i = 0;
            while (i < row) {
                System.out.print("* ");
                i++;
            }
            System.out.println();
            row--;
        }
    }

    public static void leftHalfPyramid(int maxRows) {
        System.out.println();
        System.out.println("Left Half Pyramid");
        int rows = maxRows;
        while (rows > 0) {
            // this loop prints spaces
            int j = 0;
            while (j < rows - 1) {
                System.out.print("  ");
                j++;
            }

            // this loop prints stars
            int i = 0;
            while (i <= (maxRows-rows)) {
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows--;
        }
    }

}
