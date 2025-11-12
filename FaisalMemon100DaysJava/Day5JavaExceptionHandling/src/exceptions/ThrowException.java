package exceptions;



public class ThrowException {
    static int totalBooks = 10;
    public static void borrowBooks(int bookRequest){
        int [] books = {101, 102,103,104,105,106,107,108,109,110};
        try {
            if (bookRequest > totalBooks){
                throw new Exception("Books not Enough ");
            }
            System.out.println(books[bookRequest]);

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Finally");
        }
    }



    public static void main(String[] args) {
        borrowBooks(1);
    }
}

