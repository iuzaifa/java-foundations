package strams;

import java.util.Arrays;
import java.util.List;

public class FilterWithStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3,4,5,6,7,8,9);
        System.out.println("----------Even -----------------------------------");
        numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
        System.out.println("----------Odd -----------------------------------");
        numbers.stream().filter(n -> n % 2 != 0).forEach(System.out::println);

    }
}
