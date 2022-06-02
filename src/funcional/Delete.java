package funcional;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Delete {
    public static void delete() {  // Видалення пропуску
        String fileName = "Student.txt"; // назва файлу
        Scanner scanner = new Scanner(System.in); // введення даних
        System.out.print("Введіть прізвище студента: ");
        String getStudentName = scanner.nextLine(); // прізвище студента
        String fileContent = ""; // вміст файлу
        try (Scanner search = new Scanner(new FileReader(fileName))) { // введення даних з файлу
            while (search.hasNextLine()) { // перевірка на наявність даних в файлі
                String line = search.nextLine(); // введення даних з файлу
                String[] index = line.split(" "); // відділення даних з файлу

                if (!index[2].equals(getStudentName)) { // перевірка на відповідність прізвища студента
                    fileContent += line + "\n";
                }
            }
        } catch (IOException e) {
            System.out.println("Помилка при читанні файлу");
        }
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write(fileContent);
        } catch (IOException e) {
            System.out.println("Помилка при записі в файл");
        }
        System.out.println("\tСтудент видалений");
        Show.show();
    }
}