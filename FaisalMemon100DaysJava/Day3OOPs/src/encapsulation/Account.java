package encapsulation;

public class Account {
    private double balance;

    public Account(double initialBalance) {
        if (initialBalance >= 0 ){
            this.balance = initialBalance;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0 ){
            balance += amount;
            System.out.println("Deposit successful.");
        }else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdrawal(double amount){
        if (amount > 0 ){
            balance -= amount;
            System.out.println("Withdraw successful.");
        }else {
            System.out.println("withdraw amount must be positive.");
        }
    }

    public double checkBalance(){
        return balance;
    }
}
