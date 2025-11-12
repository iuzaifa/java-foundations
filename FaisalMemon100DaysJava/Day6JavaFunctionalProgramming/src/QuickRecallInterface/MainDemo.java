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
    }
}
