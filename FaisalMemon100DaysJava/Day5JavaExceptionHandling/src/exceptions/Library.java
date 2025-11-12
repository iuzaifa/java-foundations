package exceptions;

public class Library {
    int availableBooks = 10;

    public static void borrowBooks(int bookRequest){
       int [] books = {101, 102,103,104,105,106,107,108,109,110};
        try {
            System.out.println(books[bookRequest]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException :" + e);
            throw new RuntimeException(e);
        } catch (NullPointerException e) {
            System.out.println("Null Point Exception");
            throw new RuntimeException(e);
        }
        finally {
            System.out.println("Finally Block");

        }
    }

    public static void main(String[] args) {
        borrowBooks(9);
    }
}
