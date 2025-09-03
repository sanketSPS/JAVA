//WAJP to check array is sorted or not
import java.util.Scanner;

class Sorted {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] myArr = ArrayFunction.arrayCreation();
//        System.out.println("Enter the number of elements:");
//        int size= input.nextInt();
//        int[] myArr=new int[size];
//        int i=0;
//        while (i<size){
//            System.out.print("Please enter element "+(i+1)+" :");
//            myArr[i]=input.nextInt();
//            i++;
//        }
        boolean inc = isInc(myArr);
        boolean dec = isDec(myArr);
        if (inc || dec) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }

    public static boolean isInc(int[] myArr){
        int i=1;
        while (i< myArr.length){
            if (myArr[i]< myArr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isDec(int[] myArr){
        int i=1;
        while (i< myArr.length){
            if (myArr[i]> myArr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
}
