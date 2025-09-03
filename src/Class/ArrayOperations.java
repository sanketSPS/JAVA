//Nested Class

public class ArrayOperations {
    private int[] myArr;

    public class Statistics{
        double mean(){
            double sum=0;
            for (int i : myArr) {
                sum+=i;
            }
        return sum/myArr.length;
        }
        double median(){
        return 0;
        }
    }

    public ArrayOperations(int[] myArr) {
        this.myArr = myArr;
    }

    public static void main(String[] args) {
        ArrayOperations arr=new ArrayOperations(new int[]{1,2,3,4,5});
        ArrayOperations.Statistics stat = arr.new Statistics();
        System.out.println(stat.mean());
    }
}
