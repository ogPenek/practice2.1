package scr.diary;
import scr.utils.*;
import java.util.Scanner;

public class MyDiary {
    private final Scanner scanner = new Scanner(System.in);
    private final String filePath = "diary.txt";

    public void run() {
        while (true) {
            System.out.println("1. Переглянути записи");
            System.out.println("2. Додати запис");
            System.out.println("3. Вийти");
            System.out.print("Ваш вибір: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("Ваші записи:");
                    System.out.println(FileUtils.readFromFile(filePath));
                    break;
                case "2":
                    System.out.print("Введіть новий запис: ");
                    String entry = scanner.nextLine();
                    FileUtils.writeToFile(filePath, entry);
                    break;
                case "3":
                    System.out.println("До побачення!");
                    return;
                default:
                    System.out.println("Невірний вибір, спробуйте ще.");
            }
        }
    }
}
