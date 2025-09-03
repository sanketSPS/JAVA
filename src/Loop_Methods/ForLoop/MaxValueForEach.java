//WAJP to find Max value from Array
class MaxValueForEach {
    public static void main(String[] args) {
        int[] myArr={10,30,20,40,50};
//        int max=myArr[0];
//        for (int i:myArr){
//            if (i>max){
//                max=i;
//            }
//        }
        int max=max(myArr);
        System.out.println("Max value:"+max);
    }
    public static int max(int[] myArr){
        int max=myArr[0];
        for (int i:myArr){
            if (i>max){
                max=i;
            }
        }
        return max;
    }
}
