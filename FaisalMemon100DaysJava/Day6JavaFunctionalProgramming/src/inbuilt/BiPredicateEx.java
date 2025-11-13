package inbuilt;

import java.util.function.BiPredicate;

public class BiPredicateEx {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> isSumEven =(a , b) -> (a + b) % 2 == 0;
        System.out.println("Is sum even : " + isSumEven.test(23,3));
    }
}

