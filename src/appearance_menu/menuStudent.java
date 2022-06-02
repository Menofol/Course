package appearance_menu;

import funcional.Search;
import funcional.Show;

import java.util.Scanner;
public class menuStudent {
    public static void menu() throws Exception {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
        System.out.print("\tMenu\n"
                        + "1 - Пошук по даті\n"
                        + "2 - Вивід всіх студентів\n"
                        + "3 - Вивід кількості пропусків студентів в групі\n"
                        + "0 - Повернутися до головоного меню\n"
                        + "\nYour choise: ");
        int action = scanner.nextInt();
        switch (action) {
            case 1:
                i = 1;
                Search.search();
                break;
            case 2:
                i = 1;
                Show.show();
                break;
            case 3:
                i = 1;
                count();
                break;
            case 0:
                i = 3;
                break;
            default:
                i = 1;
                System.out.println("Невірний ввід");
                break;
            }
        }
    }
    // Підрахунок кількості пропусків студентів в групі по номеру групи і вивод на екран
    public static void count() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть номер групи: ");
        int group = scanner.nextInt();
        System.out.println("Кількість пропусків студентів в групі " + group + ": \n" + Search.count(group));
    }
}