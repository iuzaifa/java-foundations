package encapsulation;

public class Main2 {
    public static void main(String[] args) {

        Account myAccount = new Account(100.00);
        System.out.println("Current balance: " + myAccount.getBalance());
        myAccount.deposit(50.00);
        System.out.println("Current balance: " + myAccount.getBalance());
        myAccount.withdrawal(100.00);
        System.out.println("Current balance: " + myAccount.getBalance());
        
    }
}
