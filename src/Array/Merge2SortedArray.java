//WAJP to merge 2 Sorted array
class Merge2SortedArray {
    public static void main(String[] args) {
        int[] arr1=ArrayFunction.arrayCreation();
        int[] arr2=ArrayFunction.arrayCreation();
        int[] merge=merge(arr1,arr2);
        System.out.println("Your Merge Array is:");
        ArrayFunction.displayArray(merge);
    }

    public static int[] merge(int[] arr1, int[] arr2){
        int size=(arr1.length) + (arr2.length);
        int[] newArr=new int[size];

        int i=0, j=0, k=0;
        while (i<arr1.length || j<arr2.length){
            if(j==arr2.length || (i<arr1.length && arr1[i]<arr2[j])){
                newArr[k]=arr1[i];
                i++;
                k++;
            }
            else{
                newArr[k]=arr2[j];
                k++;
                j++;
            }
        }
        return newArr;
    }
}
