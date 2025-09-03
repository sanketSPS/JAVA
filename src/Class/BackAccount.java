public class BackAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance=5000.00;
    double money;

    public void deposit(double money){
        if (money>0) {
            balance = balance + money;
        }
        else {
            System.out.println("Invalid amount");
        }
    }

    public double withdraw(double money){
            if (balance<money){
                System.out.println("Insufficient Money");
            }
            else{
                balance -= money;
            }
            return money;
    }

    public BackAccount() {
    }
}
