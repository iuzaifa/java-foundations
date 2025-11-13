package inbuilt;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierEx {
    public static void main(String[] args) {

        Supplier<Integer> randomNumber = ()-> new Random().nextInt(999);
        System.out.println("Random number 1: " + randomNumber.get());
        System.out.println("Random number 2: " + randomNumber.get());


        Supplier<String> s = ()-> "Hello from Supplier!";
        System.out.println("Message : "+ s.get());


        Supplier<Student> student = ()-> new Student();
        Student std = student.get();
        System.out.println("Name : "+ std.name +"\nMarks : "+ std.marks);


        Supplier<Integer> filter = () -> new Random().nextInt(20);
        Stream.generate(filter).limit(5).forEach(System.out::println);
    }
}
class Student {
    String name;
    int marks;
    Student() {
        this.name = "Abu Huzaifa";
        this.marks = 95;
    }
}