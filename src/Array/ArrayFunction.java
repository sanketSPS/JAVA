import java.util.Scanner;

class ArrayFunction {
    public static void main(String[] args) {
        arrayCreation();
        //displayArray();
    }

    public static int[] arrayCreation() {
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
        return myArr;
    }

    public static void displayArray(int[] myArr){
        int index=0;
        while(index<myArr.length){
            System.out.print(myArr[index]+ " ");
            index++;
        }
        System.out.println();
    }

    public static int[][] create2DArray(){
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
        return myArr;
    }

}
