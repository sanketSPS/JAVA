import java.util.Scanner;

//WAJP for number guess
class NumberGuess {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int guess;
        do {
            System.out.print("Please enter number to guess:");
            guess=input.nextInt();
        }
        while (guess!=5);

    }
}
