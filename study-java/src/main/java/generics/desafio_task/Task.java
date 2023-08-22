package generics.desafio_task;

public class Task {
    private String name;
    private String description;
    private Category category;
    private boolean status;

    public Task() {}

    public Task(String name, String description, Category category, boolean status) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Category getCategory() {
        return category;
    }

    public boolean isStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Tasks name: " + name + "\n"
                + "description: " + description + "\n"
                + category + "\n"
                + "status: " + status + "\n";
    }
}
