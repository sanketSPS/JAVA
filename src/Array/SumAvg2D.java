//WAJP to find sum and avg of all elements in 2D array

class SumAvg2D {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter number of rows:");
//        int rows = input.nextInt();
//        System.out.println("Please enter number of columns:");
//        int cols = input.nextInt();
//        int[][] myArr = new int[rows][cols];
//
//        int i = 0;
//        while (i < rows) {
//            int j = 0;
//            while (j < cols) {
//                System.out.print("Please enter row:" + (i + 1) + ",Column" + (j + 1) + " :");
//                myArr[i][j] = input.nextInt();
//                j++;
//            }
//            i++;
//        }
        int[][] myArr=ArrayFunction.create2DArray();
        long sum =sum(myArr);
        double avg = avg(myArr);
        System.out.println("Your sum of array is: " + sum);
        System.out.println("Your average of array is: " + avg);
    }

    public static long sum(int[][] myArr){
        int index=0;
        long res=0;
        while(index < myArr.length) {
            int j=0;
            while (j<myArr[index].length){
            res = res + myArr[index][j];
            j++;
            }
            index++;
        }
        return res;
    }

    public static double avg(int[][] myArr) {
        if (myArr.length == 0) {
            return 0;
        }
        int rows = myArr.length;
        int cols = myArr[0].length;
        double size = rows * cols;
        return sum(myArr) / size;
    }
}
