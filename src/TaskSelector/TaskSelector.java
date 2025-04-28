package JavaCore.src.TaskSelector;

import JavaCore.src.Hw3.Employee;
import JavaCore.src.Hw3.Manager;

import static JavaCore.src.Hw2.HomeworkLesson2.*;
import static JavaCore.src.Hw2.HomeworkLesson2.hasAdjacentZeros;

/**
 * Класс для выбора и запуска задач по номеру.
 */
public class TaskSelector {

    public static void runTask2() {
        int[] array1 = {2, 1, 2, 3, 4};
        int[] array2 = {2, 2, 0};
        int[] array3 = {1, 3, 5};
        int[] array4 = {1, 0, 0, 5};

        System.out.println("countEvens(array1) = " + countEvens(array1)); // 3
        System.out.println("countEvens(array2) = " + countEvens(array2)); // 3
        System.out.println("countEvens(array3) = " + countEvens(array3)); // 0

        System.out.println("differenceMaxMin(array1) = " + differenceMaxMin(array1)); // 4 - 1 = 3

        System.out.println("hasAdjacentZeros(array1) = " + hasAdjacentZeros(array1)); // false
        System.out.println("hasAdjacentZeros(array4) = " + hasAdjacentZeros(array4)); // true

    }

    public static void runTask3() {
        Employee emp1 = new Employee("Иван", 50000, 1990, 5, 15);
        Employee emp2 = new Employee("Мария", 55000, 1992, 7, 10);
        Manager boss = new Manager("Сергей", 100000, 1985, 3, 20);

        Employee[] staff = {emp1, emp2, boss};

        System.out.println("До повышения:");
        for (Employee e : staff) {
            System.out.println(e.getName() + ": " + e.getSalary());
        }

        Manager.raiseSalaryForAll(staff, 10);

        System.out.println("\nПосле повышения:");
        for (Employee e : staff) {
            System.out.println(e.getName() + ": " + e.getSalary());
        }
    }

}
