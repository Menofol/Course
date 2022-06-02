package str;

import java.io.*;
import java.util.Scanner;
public class Read {
    static Scanner in = new Scanner(System.in);
    public static void reader(){
        try{
            File file = new File ("database.txt");
            FileReader fr = new FileReader("database.txt");
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            int i = 1;
            System.out.println("\nТаблиця студентів\n ──────────────────── \n");
            while (line != null) {
                System.out.println(i+ " - " + line);
                i ++;
                // считываем остальные строки в цикле
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("\n ──────────────────── ");

        System.out.println("1 - Додати студента знов\n2 - Перейти до меню студента");
        String choice = in.nextLine();
        switch (choice){
            case "1":Save.studentvisiting();
            case "2":
                Console.studentvisiting();
            default:
                break;

        }
        Console.studentvisiting();
    }
}
