package generics;

public class Generic2 {
    public static <T> void printItem(T item) {
        System.out.println("Item: " + item);
    }

    public static void main(String[] args) {
        printItem("Hello");
        printItem(123);
        printItem(45.6);
        printItem(false);
    }
}
