package generics.desafio_task;

public class TaskTestes {
    public static void main(String[] args) {
        Category<Study> study = new Category<>("Estudar");
        Task task1 = new Task("Estudar Matemática", "Estudar matemática", study, false);

        TaskManager.addTask(task1);
        TaskManager.getAllTasks();
        System.out.println("=================================");

        Task task2 = new Task(
                "Lógica de Programação",
                "Revisar Lógica de Programação",
                study,
                true
        );

        TaskManager.addTask(task2);
        TaskManager.getAllTasks();

        System.out.println("=================================");
        TaskManager.filterTaskNameCategory("Estudar");

        System.out.println("=================================");
        TaskManager.filterTaskStatus(false);
    }
}
