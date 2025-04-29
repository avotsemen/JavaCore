package JavaCore.src.TaskSelector;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TaskSelector {
    private final Map<TaskType, Task> tasks = new HashMap<>();

    public TaskSelector() {
        tasks.put(TaskType.HOMEWORK_2, new TaskHw2());
        tasks.put(TaskType.HOMEWORK_3, new TaskHw3());
        tasks.put(TaskType.HOMEWORK_4, new TaskHw4());
        tasks.put(TaskType.HOMEWORK_5, new TaskHw5());
    }

    public void selectAndRunTask() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите задание для запуска:");
        for (TaskType taskType : TaskType.values()) {
            System.out.println(taskType.getNumber() + " - " + taskType.getDescription());
        }

        int number = scanner.nextInt();
        TaskType selectedTask = TaskType.fromNumber(number);

        if (selectedTask != null) {
            Task task = tasks.get(selectedTask);
            if (task != null) {
                task.execute();
            } else {
                System.out.println("Задание не найдено.");
            }
        } else {
            System.out.println("Некорректный выбор.");
        }
    }
}
