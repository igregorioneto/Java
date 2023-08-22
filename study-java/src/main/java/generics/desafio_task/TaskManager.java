package generics.desafio_task;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class TaskManager {
    private static List<Task> tasks = new ArrayList<>();

    static void addTask(Task task) {
        tasks.add(task);
    }

    static void getAllTasks() {
        tasks.stream().forEach(System.out::println);
    }

    static void filterTaskNameCategory(String nameCategory) {
        tasks.stream()
                .filter(t -> nameCategory.equalsIgnoreCase(t.getCategory().getName()))
                .forEach(System.out::println);
    }

    static void filterTaskStatus(boolean status) {
        tasks.stream()
                .filter(t -> status == t.isStatus())
                .forEach(System.out::println);
    }
}
