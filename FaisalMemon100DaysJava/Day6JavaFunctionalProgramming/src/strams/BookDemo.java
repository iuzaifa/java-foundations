package strams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class BookDemo {
    public static void main(String[] args) {

        List<Book> bookInventory = Arrays.asList(
                new Book("To Kill a Mockingbird", 1960, 12.99, "Classic Fiction"),
                new Book("1984", 1949, 10.50, "Dystopian Fiction"),
                new Book("Sapiens: A Brief History of Humankind", 2011, 20.00, "Nonfiction"),
                new Book("A Game of Thrones", 1996, 15.99, "Fantasy"),
                new Book("The Da Vinci Code", 2003, 9.99, "Mystery/Thriller"),
                new Book("The Great Gatsby", 1925, 8.75, "Classic Fiction"),
                new Book("Educated", 2018, 16.50, "Memoir"),
                new Book("Where the Crawdads Sing", 2018, 11.25, "Literary Fiction"),
                new Book("Cosmos", 1980, 25.00, "Science"),
                new Book("The Alchemist", 1988, 14.00, "Adventure/Fantasy")
        );

        // 1. Filtering Books cheaper than 10 ;

        Stream<Book> s1 = bookInventory.stream();
        Stream<Book> s1Filtered = s1.filter(predicate);
        s1Filtered.forEach(System.out::println);



        System.out.println("Books Less than 10 ------------------------");
        bookInventory.stream().filter(b -> b.getPrice() < 10)
                .forEach(System.out::println);
        System.out.println("Books more than 10 ------------------------");
        bookInventory.stream().filter(b -> b.getPrice() > 10)
                .forEach(System.out::println);




    }

    static Predicate<Book> predicate = new Predicate<Book>() {
        @Override
        public boolean test(Book book) {
            return book.price < 10;
        }
    };
}
