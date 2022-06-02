package appearance_menu;

import shm.Pass;
import java.io.IOException;
import java.util.Scanner;

public class Assistmenu {
    public static void assistmain() throws IOException {
        try (Scanner in = new Scanner(System.in)) {
            for (int i = 0; i < 3; i++) {
                System.out.print("\n\tMenu"+"\n1 - Меню пропусків\n2 - Меню студента\n0 - Exit\n\nYour choise: ");
                int choice = in.nextInt();
                switch (choice) {
                    case 1:
                        i = 1;
                        Pass.menu();
                        break;
                    case 2:
                        i = 1;
                        menuStudent.menu();
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
            throw new RuntimeException(e);
        }
    }

}
