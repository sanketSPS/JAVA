//WAJP to find the number of Occurrences
import java.util.Scanner;

class Occurrence {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] myArr=ArrayFunction.arrayCreation();
        System.out.println("Enter the number you want to search:");
        int num= input.nextInt();
        int occureance=occureance(myArr,num);
        System.out.println("Occurrence of "+num+" is "+occureance+" Times");
    }

    public static int occureance(int[] myArr, int num){
        int index=0;
        int result=0;
        while (index < myArr.length) {
            if (myArr[index] == num) {
                result = result + 1;
            }
            index++;
        }
        return result;
    }
}
