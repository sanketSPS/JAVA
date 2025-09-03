import java.util.Scanner;

class FahrenheittoCelsius {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Fahrenheit:");
        float fah=input.nextFloat();
        float Celsius=(fah-32)*5/9;
        System.out.println("Fahrenheit to Celsius is:"+Celsius);
    }
}
