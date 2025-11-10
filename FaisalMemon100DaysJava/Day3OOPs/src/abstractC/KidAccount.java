package abstractC;

public class KidAccount extends BankAccount{


    public KidAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        System.out.println("Kid Account deposited");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Kid Account withdrawn");
    }
}
