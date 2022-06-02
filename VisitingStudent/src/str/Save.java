package str;

import java.io.*;
import java.util.Scanner;

public class Save {
    public static void studentvisiting() {

        try (FileWriter writer = new FileWriter("database.txt",true)){
            Scanner in = new Scanner(System.in);

            System.out.println("1 - Додати студента\n2 - Повернутися до меню студентів");
            int choice = in.nextInt();
            switch (choice){
                case 1:
                    InputStreamReader sr = new InputStreamReader(System.in);
                    BufferedReader br = new BufferedReader(sr);

                    String Student,Omissions,When,Lesson,Only;
                    System.out.print("Введіть ПІП студента - ");
                    Student = br.readLine();writer.write("Студент : ");writer.write(Student);writer.write("; ");
                    System.out.print("Введіть пропусків за день - ");
                    Omissions = br.readLine();writer.write("Кількість пропусків - ");writer.write(Omissions);writer.write("; ");
                    System.out.print("Дата - ");
                    When = br.readLine();writer.write("День пропуску(ів) - ");writer.write(When);writer.write("; ");
                    System.out.print("З яких предмета(ів) - ");
                    Lesson = br.readLine();writer.write("Предмет(и) - ");writer.write(Lesson);writer.write("; ");
                    System.out.print("Кількість студентів які не відвідали пару - ");
                    Only = br.readLine();writer.write("Не прибуло на заннятя - ");writer.write(Only); writer.write(".\n");
                    break;
                case 2:
                    Str service = new Str();
                    service.run();
                    break;
                default:
                    System.out.println("\nНе коректно введені дані");
                    break;
            }
        } catch (IOException e) {
            System.out.println("Помилка при введені даних");
        }
    }
}

