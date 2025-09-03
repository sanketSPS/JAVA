import java.util.Scanner;

//WAJP to find number of Occurrences of number in array
class OccForEach {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] myArr={4,6,2,9,4,1,6};
        System.out.println("Please enter you want to check:");
        int num=input.nextInt();
        int occ=occ(myArr,num);
        System.out.println("Number of occurrences:"+occ);
    }
    public static int occ(int[] myArr, int num){
        int occ=0;
        for(int i:myArr){
            if(i==num) {
                occ++;
            }
        }
        return occ;
    }
}
