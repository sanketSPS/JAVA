public class TestAccount {
    public static void main(String[] args) {
        BackAccount acc=new BackAccount();
        acc.deposit(0);
        acc.deposit(500);
        acc.withdraw(500);
        acc.withdraw(6000);

    }
}
