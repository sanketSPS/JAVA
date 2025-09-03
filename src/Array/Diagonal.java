//WAJP to find the sum of two diagonal elements(Number of rows and columns must be same)
class Diagonal {
    public static void main(String[] args) {
        int[][] myArr=ArrayFunction.create2DArray();
        long sum=sum(myArr);
        System.out.println("Sum of Diagonal is: "+sum);
    }

    public static long sum(int[][] myArr){
        long leftSum=leftSum(myArr);
        long rightSum=rightSum(myArr);
        long sum=leftSum+rightSum;
        if (myArr.length % 2 != 0){
            int index=myArr.length/2;
            sum-=myArr[index][index];
        }
        return sum;
    }

    public static long leftSum(int[][] myArr){
        long sum=0;
        int i=0;
        while (i<myArr.length){
            sum+=myArr[i][i];
            i++;
        }
        return sum;
    }

    public static long rightSum(int[][] myArr){
        long sum=0;
        int i=0;
        while (i<myArr.length){
            int col= myArr.length-1-i;;
            sum+=myArr[i][col];
            i++;
        }
        return sum;
    }
}
