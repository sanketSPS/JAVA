import java.util.Scanner;

//WAJP to print month of the year based on number(1-12) by taking input
class SwitchMonth {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter the month number:");
        int month=input.nextInt();
        switch (month){
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("Mar");
                break;
            case 4:
                System.out.println("Apr");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("Aug");
                break;
            case 9:
                System.out.println("Sept");
                break;
            case 10:
                System.out.println("Oct");
                break;
            case 11:
                System.out.println("Nov");
                break;
            case 12:
                System.out.println("Dec");
                break;
            default:
                System.out.println("Please enter valid month");
//            case 1 -> "January";
//            case 2 -> "January";
//            case 3 -> "January";
//            case 4 -> "January";
//            case 5 -> "January";
//            case 6 -> "January";
//            default -> "Please provide valid input"
        }
    }
}
