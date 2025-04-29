package JavaCore.src.Hw5;

import java.io.*;
import java.nio.file.*;

public class FileBackup {
    public static void backupFiles(String sourceDirPath) {
        Path sourceDir = Paths.get(sourceDirPath);
        Path backupDir = Paths.get("./backup");

        try {
            if (!Files.exists(backupDir)) {
                Files.createDirectory(backupDir);
            }

            try (DirectoryStream<Path> stream = Files.newDirectoryStream(sourceDir)) {
                for (Path entry : stream) {
                    if (Files.isRegularFile(entry)) {
                        Path destFile = backupDir.resolve(entry.getFileName());
                        Files.copy(entry, destFile, StandardCopyOption.REPLACE_EXISTING);
                        System.out.println("Скопировано: " + entry.getFileName());
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка резервного копирования: " + e.getMessage());
        }
    }
}

