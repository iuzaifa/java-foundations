package QuickRecallInterface;

public class MainDemo {

    public static void main(String[] args) {
        Calculator calc = new Calculator() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };

        int result = calc.operate(3,7);
        calc.printResult(result);
        Calculator.info();
    }
}
