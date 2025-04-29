package JavaCore.src.TaskSelector;

import JavaCore.src.Hw5.FileBackup;
import JavaCore.src.Hw5.TicTacToeCompressor;

public class TaskHw5 implements Task {
    @Override
    public void execute() {
        System.out.println("=== Задание 1: Резервное копирование файлов ===");
        FileBackup.backupFiles(".");

        System.out.println("\n=== Задание 2: Побитовая упаковка поля 3x3 ===");
        int[] board = {1, 2, 0, 3, 1, 0, 2, 2, 1}; // Пример массива
        TicTacToeCompressor.compressToFile(board, "tictactoe.bin");

        System.out.println("\n=== Задание 3: CI/CD с dvwa-docker — необходимо приложить скриншоты ===");
    }
}
