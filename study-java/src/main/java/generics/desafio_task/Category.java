package generics.desafio_task;

public class Category<T> {
    private String name;

    public Category(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Category: " + name;
    }
}
