package inbuilt;

import java.util.function.Function;

public class FunctionInterface {

    static int b = 7;
    public static Function<Integer, Integer> addFunction = (a) -> a + 10;
    public static Function<Integer, Integer> subtract = (a) -> a - b ;

    public static Function<Integer, Integer> combinedFunction = addFunction.andThen(subtract);

    public static Function<String, String> printName = (name)-> name;

    public static void main(String[] args) {
        System.out.println("Function Interface  : "+ addFunction.apply(10));
        System.out.println("Function Interface  : "+ subtract.apply(20));

        System.out.println("Combined Function  : "+ combinedFunction.apply(10));


        System.out.println("Function Interface print name : " + printName.apply("Abu Huzaifa"));


    }
}
