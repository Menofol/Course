package appearance_menu;

import shm.Pass;
import java.io.IOException;
import java.util.Scanner;

public class Assistmenu {
    public static void assistmain() {
        try (Scanner in = new Scanner(System.in)) {
            for (int i = 0; i < 3; i++) { // цикл для повторення меню
                System.out.print("\n\tMenu"+"\n1 - Меню пропусків\n2 - Меню студента\n0 - Exit\n\nYour choise: "); // вивід меню
                int choice = in.nextInt(); // введення вибору користувача
                switch (choice) { // вибір дії користувача
                    case 1:
                        i = 1;
                        Pass.menu(); // виклик меню пропусків
                        break;
                    case 2:
                        i = 1;
                        menuStudent.menu(); // виклик меню студента
                        break;
                    case 3:
                        i = 1;
                        break;
                    case 0:
                        i = 3;
                        break;
                    default:
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e); // виключення при помилці
        }
    }

}
