package QuickRecallInterface;

public interface Calculator {

    int operate(int a, int b);

    default void printResult(int result){
        System.out.println("Result : "+ result);
    }

    static void info() {
        System.out.println("Functional Interface: Calculator");
    }
}
