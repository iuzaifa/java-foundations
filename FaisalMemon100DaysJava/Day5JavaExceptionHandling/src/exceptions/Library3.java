package exceptions;

public class Library3 {

    static int totalBooks = 10;
    static String[] members = {"A", "B", "C", "D", "E", "F", "G", "H"};
    public static void borrowBooks(int bookRequest) {
        int [] books = {101, 102,103,104,105,106,107,108,109,110};
        try {
            if (bookRequest > totalBooks){
                throw new BookUnavailableException("Books not Enough ", "Member exception");
            }
            System.out.println(books[bookRequest]);
            System.out.println(members[4]);

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
