package funcional;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Search {
    public static void search() {
        //Поиск Student по имени в файле students.txt
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nВведіть дату пропуску: ");
        String name = scanner.nextLine();
        try {
            FileReader fileReader = new FileReader("Student.txt");
            Scanner scanner1 = new Scanner(fileReader);
            while (scanner1.hasNextLine()) {
                String line = scanner1.nextLine();
                if (line.contains(name)) {
                    System.out.println(line);
                }
            }
        }
        catch (IOException e) {
            System.out.println("Помилка введення-виведення");
        }
    }
    public static String count(int group) {
        String count = ""; // кількість груп
        try { // перевірка на введення правильної групи
            FileReader fileReader = new FileReader("Student.txt"); // введення даних з файлу
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine(); // введення даних з файлу
                if (line.contains(Integer.toString(group))) { // перевірка на наявність даних в файлі
                    count += line + "\n"; // додавання даних в стрічку
                }
            }
        }
        catch (IOException e) {
            System.out.println("Помилка введення-виведення");
        }
        return count; // повертання кількості пропусків в групі
    }
}
