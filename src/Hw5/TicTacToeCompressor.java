package JavaCore.src.Hw5;

import java.io.FileOutputStream;
import java.io.IOException;

public class TicTacToeCompressor {
    public static void compressToFile(int[] field, String filePath) {
        if (field.length != 9) {
            throw new IllegalArgumentException("Поле должно содержать 9 элементов");
        }

        int packed = 0;
        for (int i = 0; i < 9; i++) {
            if (field[i] < 0 || field[i] > 3) {
                throw new IllegalArgumentException("Все значения должны быть в диапазоне [0, 3]");
            }
            packed |= (field[i] << (2 * (8 - i)));
        }

        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            fos.write((packed >> 16) & 0xFF);
            fos.write((packed >> 8) & 0xFF);
            fos.write(packed & 0xFF);
            System.out.println("Данные сохранены в: " + filePath);
        } catch (IOException e) {
            System.err.println("Ошибка записи в файл: " + e.getMessage());
        }
    }
}

