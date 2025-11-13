package inbuilt;

import java.util.Objects;
import java.util.function.BiFunction;

public class BiFunctionEx {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> sum = (a, b)-> a + b;
        System.out.println("BiFunction => : " + sum.apply(33,67));

        BiFunction<Integer, Integer, Integer> subtract = (a, b)-> a - b;
        System.out.println("BiFunction => : " + subtract.apply(100,67));


        BiFunction<String, String, String> combine = (firstname, lastname) -> firstname + lastname;
        System.out.println("Full name : " + combine.apply("Abu " , "Huzaifa"));

        BiFunction<Student2, Marks, String> printResult  = ((student, marks)
                -> student.firstname + " " + student.lastname + " score " + marks.mark + " marks.");

        Student2 std = new Student2("Abu", "Huzaifa");
        Marks marks = new Marks(99);
        String result = printResult.apply(std, marks);
        System.out.println(result);

    }
}

class Student2 {
    String firstname;
    String lastname;

    public Student2(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }
}
class Marks{
    int mark ;

    public Marks(int mark) {
        this.mark = mark;
    }
}

