//WAJP to reverse the array element
class Reverse {
    public static void main(String[] args) {
        int[] myArr=ArrayFunction.arrayCreation();
        reverse(myArr);
        ArrayFunction.displayArray(myArr);
//        int index=0;
//        while(index<myArr.length){
//            System.out.print(myArr[index]+ " ");
//            index++;
//        }
    }

    public static void reverse(int[] myArr){
        int i=0;
        while (i< myArr.length/2){
            int swap=myArr[i];
            myArr[i]=myArr[myArr.length-1-i];
            myArr[myArr.length-1-i]=swap;
            i++;
        }
    }
}
