package JavaCore.src;

import JavaCore.src.TaskSelector.Task;

import java.util.Scanner;

/**
 * Основной класс программы
 */
public class Main {
    /**
     * Точка входа в программу
     *
     * @param args аргументы командной строки
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите задание для запуска:");
        for (Task task : Task.values()) {
            System.out.println(task.getNumber() + " - " + task.getDescription());
        }

        int choice = scanner.nextInt();
        Task selectedTask = Task.getByNumber(choice);

        if (selectedTask != null) {
            selectedTask.run();
        } else {
            System.out.println("Неверный выбор. Пожалуйста, введите корректный номер.");
        }

        scanner.close();
    }


}
