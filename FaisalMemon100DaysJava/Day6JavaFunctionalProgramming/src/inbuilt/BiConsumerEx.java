package inbuilt;

import java.util.function.BiConsumer;

public class BiConsumerEx {
    public static void main(String[] args) {
        BiConsumer<String, Integer> printInfo = (name, age) ->
                System.out.println(name + " is " + age + " years old.");

        printInfo.accept("Huzaifa", 22);
        printInfo.accept("ALi", 25);
    }
}
