import java.util.Scanner;

public class NumberGuessing {
    int random;

    NumberGuessing(){
        random=(int)Math.ceil(Math.random()*100);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double num=input.nextDouble();
        Math.random();
    }
}
