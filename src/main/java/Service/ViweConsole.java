package Service;

import model.Human;

import java.io.IOException;
import java.util.Scanner;

public class ViweConsole {
    private Scanner scanner = new Scanner(System.in);
    private Processing processing;
    private Human human;
    private SaveData saveData;

    public void run() throws IOException {
        do {
            System.out.println("Введите Данные в Формате: <Фамилия> <Имя> <Отчество> <дата рождения DD.MM.YYYY> <номер телефона> <f and m>");
            System.out.println("Пример: Иванов Иван Иванович 00.00.0000 123456 m");
            System.out.print("Введите Данные: ");
            String[] arr = scanner.nextLine().split(" ");
            processing = new Processing(arr);
            human = new Human(processing.processingData());
            saveData = new SaveData(human);
            saveData.save();
            System.out.println("Хотите ввести еще данные? (Yes/No)");
        }while (scanner.nextLine().equalsIgnoreCase("Yes"));
    }
}
