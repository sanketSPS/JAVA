//WAJP to find sum and avg of all elements in array
class SumAvg {
    public static void main(String[] args) {

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
        long sum=sum(myArr);
        System.out.println("Sum of an Array is:"+sum);
        double avg=sum(myArr)/myArr.length;
        System.out.println("Avg of an Array is:"+avg);
    }

    public static long sum(int[] myArr){
        int index=0;
        long res=0;
        while(index < myArr.length) {
            res = res + myArr[index];
            index++;
        }
        return res;
    }

}

