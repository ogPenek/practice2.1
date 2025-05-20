package scr.utils;
import java.io.*;
import java.nio.file.*;

public class FileUtils {

    public static String readFromFile(String filePath) {
        try {
            return Files.readString(Path.of(filePath), java.nio.charset.StandardCharsets.UTF_8);
        } catch (IOException e) {
            return "Не вдалося прочитати файл.";
        }
    }

    public static void writeToFile(String filePath, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(content);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Помилка запису у файл.");
        }
    }
}

