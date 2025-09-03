import java.util.Scanner;

class MaxMin {
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
        System.out.println("Maximum number of array is:"+Max(myArr));
        System.out.println("Minimum number of array is:"+Min(myArr));
    }

    public static int Max(int[] myArr) {
        if(myArr.length==0){
            return Integer.MIN_VALUE;
        }
        int index = 1;
        int max = myArr[0];
        while (index < myArr.length) {
            if (max < myArr[index]) {
                max = myArr[index];
            }
            index++;
        }
        return max;
    }

    public static int Min(int[] myArr) {
        int min=Integer.MAX_VALUE;
        int index = 0;
        while (index < myArr.length) {
            if (min > myArr[index]) {
                min = myArr[index];
            }
            index++;
        }
        return min;
    }
}
