//WAJP to print array using while loop
class ArrayTraversal {
    public static void main(String[] args) {
      //  int[] myArr = new int[5];
        int[] myArr= {10, 20, 30, 40, 50};
        System.out.println(myArr[0]);
        String[] str=new String[4];
        System.out.println("Array Length is:"+str.length);

        int index=0;
        while(index<5){
            System.out.println(myArr[index]);
            index++;
        }
        System.out.println("2D Array Traversal");
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int i=0;//rows
        while (i<arr.length){
            int j=0;//columns
            while (j<arr[i].length){
                System.out.print(arr[i][j]+" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
