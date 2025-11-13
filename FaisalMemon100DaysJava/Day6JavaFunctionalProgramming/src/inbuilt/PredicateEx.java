package inbuilt;

import java.lang.management.ThreadInfo;
import java.util.function.Predicate;

public class PredicateEx {
    public static void main(String[] args) {

        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println(isEven.test(33));

        Predicate<String> startsWithA = name -> name.startsWith("A");
        System.out.println(startsWithA.test("Abu"));     // true

    }

}
