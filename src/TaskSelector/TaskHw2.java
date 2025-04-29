package JavaCore.src.TaskSelector;

public class TaskHw2 implements Task {
    @Override
    public void execute() {
        int[] example1 = {2, 1, 2, 3, 4};
        int[] example2 = {2, 2, 0};
        int[] example3 = {1, 3, 5};

        System.out.println("Количество четных элементов:");
        System.out.println("Массив 1: " + countEvens(example1)); // → 3
        System.out.println("Массив 2: " + countEvens(example2)); // → 3
        System.out.println("Массив 3: " + countEvens(example3)); // → 0

        int[] arr = {2, 7, 5, 1, 9};
        System.out.println("\nРазница между max и min элементами массива: " + maxMinDifference(arr));

        int[] arrWithZeros = {1, 0, 0, 3};
        System.out.println("\nЕсть ли два подряд идущих нуля: " + hasTwoAdjacentZeros(arrWithZeros));
    }

    private int countEvens(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num % 2 == 0) count++;
        }
        return count;
    }

    private int maxMinDifference(int[] array) {
        int max = array[0], min = array[0];
        for (int num : array) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        return max - min;
    }

    private boolean hasTwoAdjacentZeros(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == 0 && array[i + 1] == 0) return true;
        }
        return false;
    }
}
