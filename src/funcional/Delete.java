package funcional;

import java.io.FileReader;
import java.io.FileWriter; // опис
import java.io.IOException;
import java.util.Scanner;
public class Delete {
    public static void delete() {
        String fileName = "Student.txt";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть прізвище студента: ");
        String getStudentName = scanner.nextLine();
        String fileContent = "";
        try (Scanner search = new Scanner(new FileReader(fileName))) {
            while (search.hasNextLine()) {
                String line = search.nextLine();
                String[] index = line.split(" ");

                if (!index[2].equals(getStudentName)) {
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