//WAJP to return a new array by removing element from array
import java.util.Scanner;

class ArrayDelete {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] myArr=ArrayFunction.arrayCreation();
        System.out.println("Please the element you want remove");
        int numDel= input.nextInt();
        int[] newArr=delete(myArr,numDel);
        //Display array
        System.out.println("New array is here:");
        ArrayFunction.displayArray(newArr);

//        int index=0;
//        while(index<newArr.length){
//            System.out.println(myArr[index]);
//            index++;
//        }
    }

    public static int[] delete(int[] myArr, int numDel){
        int occ=Occurrence.occureance(myArr,numDel);
        //Occurrence logic
//        int index=0;
//        int result=0;
//        while (index < myArr.length) {
//            if (myArr[index] == num) {
//                result = result + 1;
//            }
//            index++;
//        }
        if(occ==0){
            return myArr;
        }
        int newSize=myArr.length - occ;
        int[] newArr=new int[newSize];
        int i=0,j=0;
        while (i<myArr.length) {
            if (myArr[i] != numDel) {
                newArr[j]=myArr[i];
                j++;
            }
            i++;
        }
        return newArr;
    }

}
