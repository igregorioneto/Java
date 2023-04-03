package solid.testes;

import solid.single.Book.Book;
import solid.single.Book.BookPrinter;
import solid.single.Book.Ebook;
import solid.single.Book.Magazine;

public class Testes {
    public static void main(String[] args) {
        Book book = new Book("The Lord of the Rings", "J. R. R. Tolkien", "Excellent book");
        BookPrinter print = new BookPrinter(book);
        print.printTextToConsole();

        Book ebook = new Ebook("pdf", "The Lord of the Rings", "J. R. R. Tolkien", "Excellent ebook");
        print.setBook(ebook);
        print.printTextToConsole();
    }
}
