package solid.single.Book;

public class Ebook extends Book {
    private String format;

    public Ebook (String format, String name, String author, String text) {
        super(name, author, text);
        this.format = format;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}
