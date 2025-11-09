package encapsulation;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Abu Huzaifa", "Male", 22);
        // name can not be change because name is private
        // person.name = "Abu "
        person.setName("Abu");
        System.out.println(person.getName());
        System.out.println(person.getAge());
        person.setAge(-22);



    }
}
