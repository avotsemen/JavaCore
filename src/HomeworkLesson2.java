package JavaCore.src;

/**
 * Класс для выполнения домашнего задания по уроку 2: Данные и функции.
 */
public class HomeworkLesson2 {

    /**
     * Возвращает количество чётных элементов в переданном массиве.
     *
     * @param nums массив целых чисел
     * @return количество чётных чисел в массиве
     */
    public static int countEvens(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    /**
     * Возвращает разницу между максимальным и минимальным элементами в массиве.
     *
     * @param nums массив целых чисел (предполагается, что он не пустой)
     * @return разница между максимальным и минимальным элементами
     */
    public static int differenceMaxMin(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    /**
     * Проверяет, есть ли в массиве два подряд идущих нулевых элемента.
     *
     * @param nums массив целых чисел
     * @return {@code true}, если найдены два соседних нуля; {@code false} в противном случае
     */
    public static boolean hasAdjacentZeros(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0 && nums[i + 1] == 0) {
                return true;
            }
        }
        return false;
    }
}
