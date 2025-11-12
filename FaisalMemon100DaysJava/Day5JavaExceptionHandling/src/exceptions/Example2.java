package exceptions;

public class Example2 {
    void method1() throws Exception {
        throw new Exception("Something went wrong!");
    }

    void method2() throws Exception {
        method1(); // doesn't catch, just passes it up
    }

    public static void main(String[] args) {
        try {
            new Example2().method2();
        } catch (Exception e) {
            System.out.println("Handled in main: " + e.getMessage());
        }
    }

}
