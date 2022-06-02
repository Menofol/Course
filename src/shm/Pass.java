package shm;

import funcional.Delete;
import funcional.Search;
import funcional.Show;
import funcional.Sort;

import java.io.*;
import java.util.Scanner;
public class Pass {
    Student student = new Student(); // об'єкт класу Student
    public static void menu() throws IOException { // меню
        Pass pass = new Pass(); // створюємо об'єкт класу Pass
        Scanner scanner = new Scanner(System.in); // створюємо об'єкт класу Scanner
        for (int i = 0; i < 3; i++) { // цикл для повторення меню

            System.out.print("\n\tMenu Pass\n" // вивід меню
                    + "1 - Додати пропуск\n"
                    + "2 - Вивести всі пропуски\n"
                    + "3 - Видалення пропуска\n"
                    + "4 - Відсортувати\n"
                    + "5 - Пошук\n"
                    + "0 - Повернутися до головного меню\n"
                    + "\nYour choise: ");
            int choice = scanner.nextInt(); // введення вибору користувача
            switch (choice) {
                case 1:
                    i = 1;
                    pass.addPass(); // виклик меню додавання пропуска
                    pass.printPass(); // виведення введених пропусків
                    break;
                case 2:
                    i = 1;
                    Show.show(); // вивід всіх пропусків
                    break;
                case 0:
                    i = 3;
                    System.out.println("\nВертаємось в головне меню");
                    break;
                case 3:
                    i = 1;
                    Show.show(); // вивід всіх пропусків
                    Delete.delete(); // виклик меню видалення пропуска
                    break;
                case 4:
                    i = 1;
                    Sort.sort(); // виклик меню сортування
                    break;
                case 5:
                    i = 1;
                    Show.show(); // вивід всіх пропусків
                    Search.search(); // виклик меню пошуку
                    break;
                default:
                    i = 1;
                    System.out.println("Неверный выбор");
                    break;
            }
        }
    }
    private void addPass() { // додавання пропуска
        System.out.print("Введіть Фамілію Им'я студента: ");
        Scanner scanner = new Scanner(System.in);
        String studentName = scanner.nextLine();
        student.setName(studentName);
        System.out.print("Введіть групу студента: ");
        String studentGroup = scanner.nextLine();
        student.setGroup(studentGroup);
        System.out.print("Введіть курс студента: ");
        String studentCourse = scanner.nextLine();
        student.setCourse(studentCourse);
        System.out.print("Введіть факультет студента: ");
        String studentFaculty = scanner.nextLine();
        student.setFaculty(studentFaculty);
        System.out.print("Введіть тип пропуска студента(н/х): ");
        String studentPassType = scanner.nextLine();
        student.setPassType(studentPassType);
        System.out.print("Введіть дату пропуску студента: ");
        String studentPassDate = scanner.nextLine();
        student.setPassDate(studentPassDate);
        System.out.print("Введіть причину пропуска студента: ");
        String studentPassReason = scanner.nextLine();
        student.setPassReason(studentPassReason);
        int previusID = 0; // поле для збереження попереднього ID
        StringBuffer sb=new StringBuffer(); // створюємо об'єкт класу StringBuffer
        try // перевірка на відсутність файлу
        {
            BufferedReader br=new BufferedReader(new FileReader("Student.txt")); // читаємо файл
            String s=""; // змінна для зберігання рядка з файлу
            while((s=br.readLine())!=null) // поки не досягнемо кінця файлу
            {
                String data[] = new String[7]; // масив для зберігання даних з файлу
                data = s.split(","); // розділяємо рядок за пробілом або комою, можно змінити на інший символ
                previusID = Integer.parseInt (data[0]); // перетворюємо строку в число
            }}
        catch(Exception ignored) {// при виникненні помилки просто пропускаємо її
        }
        if(previusID>0) { // перевіряємо чи є інформація в файлі
            previusID=previusID+1; // збільшуємо на 1 значення з файлу
        }
        else{
            previusID=1; // якщо немає значення в файлі, то присвоюємо 1
        }
        try {
            FileWriter fileWriter = new FileWriter("Student.txt", true); // записуємо дані в файл
            fileWriter.write("" + previusID + ", "); // записуємо попередній ID
            fileWriter.write("Студент: " + student.getName() + " | " ); // записуємо дані про студента
            fileWriter.write("Группа: " + student.getGroup() + " | ");  // записуємо дані про групу
            fileWriter.write("Курс: " + student.getCourse() + " | "); // записуємо дані про курс
            fileWriter.write("Факультет: " + student.getFaculty() + " | "); // записуємо дані про факультет
            fileWriter.write("Тип пропуска: " + student.getPassType() + " | "); // записуємо дані про тип пропуска
            fileWriter.write("Дата пропуска: " + student.getPassDate() + " | "); // записуємо дані про дату пропуска
            fileWriter.write("Причина пропуска: " + student.getPassReason() + ";\n"); // записуємо дані про причину пропуска
            fileWriter.close(); // закриваємо потік

        } catch (IOException e) {
            throw new RuntimeException(e); // повертаємо помилку
        }
    }
    private void printPass() {
        System.out.print("\nСтудент: " + student.getName() // виводима в консоль дані про студента
                + "\nГруппа: " + student.getGroup() // виводима в консоль дані про группу
                + "\nКурс: " + student.getCourse() // виводима в консоль дані про курс
                + "\nФакультет: " + student.getFaculty() // виводима в консоль дані про факультет
                + "\nТип пропуска: " + student.getPassType() // виводима в консоль дані про тип пропуска
                + "\nДата пропуска: " + student.getPassDate() // виводима в консоль дані про дату пропуска
                + "\nПричина пропуска: " + student.getPassReason() // виводима в консоль дані про причину пропуска
                + "\n");
    }
}
