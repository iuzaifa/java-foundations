package methodReferences;

import java.beans.Customizer;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MethodReferences {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("Abu Huzaifa", "Ali", "Aman", "Ahamad", "Salim");

        // using for loop
        for (int i = 0; i < name.size(); i++){
            System.out.println(name.get(i));
        }

        System.out.println("---------------------------");
        // using enhanced loop
        for (String e : name)
            System.out.println(e);

        System.out.println("----------Consumer-----------------");


        Consumer<String> printName = new Consumer<String>() {
            @Override
            public void accept(String name) {
                System.out.println(name);
            }
        };
        name.forEach(printName);

        name.forEach((String n)-> {
            System.out.println(n);
        });



    }
}
