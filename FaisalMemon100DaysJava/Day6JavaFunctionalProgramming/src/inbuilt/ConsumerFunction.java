package inbuilt;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerFunction {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Java", "Python", "JavaScript", "Php", "C++", "C#");



        // 1. Using Lambda Expression
        System.out.println("1. Using Lambda Expression");
        names.forEach(n -> System.out.println("hi "+ n));

        // 2. Using Consumer Interface Implementation
        System.out.println("2. Using Consumer Interface Implementation");
        Consumer<String> printName = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        names.forEach(printName);

        // 3. Using Method Reference
        System.out.println("3. Using Method Reference");
        names.forEach(System.out::println);

    }
}
