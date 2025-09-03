package WhileLoop;

class Argument {
    public static void main(String[] args) {
        //Addition of numbers by passing argument to function
        int res=addition(4,5);
        System.out.println("Addition is: "+res);
    }
    public static int addition(int num1,int num2){
        int sum=num1 +num2;
        return sum;
    }
}
