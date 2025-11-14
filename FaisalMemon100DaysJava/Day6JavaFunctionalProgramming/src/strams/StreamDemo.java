package strams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Grapes", "Papaya");
        for (String e : fruits)
            System.out.println(e);

        System.out.println("--------------------------------------");
        Stream<String> stream = fruits.stream();
        stream.forEach(System.out::println);

        System.out.println("--------------------------------------");
        Stream<String> stream1 = fruits.stream();
        Stream<String> filter = stream1.filter(name -> name.startsWith("B"));
        filter.forEach(System.out::println);

        fruits.stream().filter(n ->
                n.startsWith("A")).forEach(System.out::println);

    }
}
