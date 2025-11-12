public class LetsSeeException {
    public static void main(String[] args) {

        double x_double = 10.0;
        double y_double = 0.0;
        double result_double = x_double / y_double;
        System.out.println(result_double); // Output: Infinity


        // ArithmeticException: / by zero
        /**
         * Exception: A problem that stops normal flow of program execution.
         * Here, dividing by 0 will cause ArithmeticException.
         */

        int x = 10;
        int y = 0;

        try {
            // risky code
            float result = x / y;
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            // handling exception
            System.out.println("Error: Cannot divide by zero! (" + e + ")");
        }
        finally {
            // this block always runs
            System.out.println("Program ended safely.");
        }

        int[] a = {1, 2, 3};
        try {
            System.out.println(a[6]);
            System.out.println("Done");
        }catch (Exception e){
            System.out.println("Caught :" + e);
        }

    }
}
