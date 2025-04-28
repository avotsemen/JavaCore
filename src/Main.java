package JavaCore.src;

import static JavaCore.src.HomeworkLesson2.*;

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
        System.out.println("Hello, world!");
    }
}
