package solid.single.Book;

public class BookPrinter {
    PublicationType book;

    public BookPrinter(PublicationType book) {
        this.book = book;
    }
    public void printTextToConsole() {
        System.out.println(book);
    }

    public void setBook(PublicationType book) {
        this.book = book;
    }
}
