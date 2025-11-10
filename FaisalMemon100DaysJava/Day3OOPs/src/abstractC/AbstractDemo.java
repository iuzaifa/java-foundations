package abstractC;

public class AbstractDemo {

    public static void main(String[] args) {
        SavingAccount s = new SavingAccount("S-12344", 500);
//        s.deposit(200);
//        s.withdraw(200);
        s.setAccountNumber("S-12345");
        System.out.println("S Balance : "+ s.getBalance() +" & Ac/no " + s.getAccountNumber());


        CurrentAccount c = new CurrentAccount("C-1233", 8900);
//        c.deposit(500);
//        c.withdraw(400);
        c.setAccountNumber("S-1134");
        System.out.println("C Balance : "+  c.getBalance() +" & Ac/no : " + c.getAccountNumber());

        KidAccount k = new KidAccount("K-12345" , 50);
        System.out.println("K Balance : "+  k.getBalance() +" & Ac/no : " + k.getAccountNumber());


        BankAccount bn = new SavingAccount("SA-6543" , 500);
        BankAccount cr = new CurrentAccount("CR-76543", 800);
        BankAccount kd = new KidAccount("KD-76543", 900);
        System.out.println("SA Balance : "+  bn.getBalance() +" & Ac/no : " + bn.getAccountNumber());
        System.out.println("CR Balance : "+  cr.getBalance() +" & Ac/no : " + cr.getAccountNumber());
        System.out.println("KD Balance : "+  kd.getBalance() +" & Ac/no : " + kd.getAccountNumber());




    }
}
