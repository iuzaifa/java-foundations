package inbuilt;

import java.util.function.Function;

public class FunctionInterface {

    static int b = 10;
    public static Function<Integer, Integer> addFunction = (a) -> a + 34;
    public static Function<Integer, Integer> subtract = (a) -> a - b ;
    public static Function<String, String> printName = (name)-> name;

    public static void main(String[] args) {
        System.out.println("Function Interface  : "+ addFunction.apply(6));
        System.out.println("Function Interface  : "+ subtract.apply(100));
        System.out.println("Function Interface print name : " + printName.apply("Abu Huzaifa"));


    }
}
