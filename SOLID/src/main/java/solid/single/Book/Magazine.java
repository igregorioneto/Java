package solid.single.Book;

public class Magazine implements IsWordInText, PublicationType {
    private String text;

    public boolean isWordInText(String word) {
        return text.contains(word);
    }
}
