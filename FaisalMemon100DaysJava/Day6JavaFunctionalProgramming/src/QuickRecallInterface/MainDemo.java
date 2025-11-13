package QuickRecallInterface;

public class MainDemo {

    public static void main(String[] args) {
        // without Lambda expression
        Calculator calc = new Calculator() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };

        int result = calc.operate(3,7);
        calc.printResult(result);
        Calculator.info();


        // with Lambda Expression
        Calculator calculator = (a, b) -> a + b;
        int sum = calculator.operate(33,77);
        calculator.printResult(sum);
        Calculator.info();


        PrintName name = (s) -> s;
        String n = name.printFullName("Abu Huzaifa");
        System.out.println(n);

        ConcatenateName con = (firstName, lastname) -> firstName.concat(lastname);
        String fullName = con.concatenateName("Abu", " Huzaifa" );
        con.printFullName(fullName);

        new Thread(()-> System.out.println("New Thread"));


        System.out.println("End");
    }
}
