package str;

import java.util.Objects;
import java.util.Scanner;

public class Console {
    public static void line(){
        System.out.println(" ──────────────────── ");
    }
    static Scanner in = new Scanner(System.in);

    public static void menu(){

        while (true){
            line();
            System.out.println("1 - Меню студентів\n" +
                    "2 - Меню пропусків\n" +
                    "0 - Вихід");
            line();
            String input = in.nextLine();

            switch (input){
                case "1":
                    studentvisiting();
                    break;
                case "2":
                    studentMenu();
                    break;
                case "0": return;
                default:

                    System.out.println("Не коректно введені дані");
                    line();
                    break;
            }
        }
    }



    public static void studentvisiting(){
        while (true){

            line();
            System.out.println("1 - Вивести всіх студентів\n" +
                    "2 - Додати студента\n" +
                    "3 - Видалити студента\n" +
                    "4 - Оновити інформацію студента\n" +
                    "5 - Пошук\n" +
                    "6 - Сортування\n" +
                    "0 - Повернутися");
            line();

            String input = in.nextLine();

            if(Objects.equals(input, "0")) break;

            switch (input){
                case "1":
                    Read.reader();
                    break;
                case "2":

                    Save.studentvisiting();//vodii pasagir
                    break;
                case "3":
                case "4":
                    break;
                case "5":
                    studentSearch();
                    break;
                case "6":
                    studentShort();
                    break;
                case "0":
                    return;
                default:

                    System.out.println("Не коректно введені дані");
                    line();
                    break;
            }
        }
    }

    public static void studentSearch(){

        while (true){
            line();
            System.out.println("1 - Пошук по Імені\n" +
                    "2 - Пошук по назві Призвіщу\n" +
                    "3 - Пошук по пропускам\n" +
                    "0 - Повернутися");
            line();

            String input = in.nextLine();

            switch (input){
                case "1":
                case "2":
                case "3":
                    break;
                case "0": return;
                default:

                    System.out.println("Не коректно введені дані");
                    line();
                    break;
            }
        }
    }

    public static void studentShort(){

        while (true){
            line();
            System.out.println("1 - Сортування за Іменім\n" +
                    "2 - Сортування у спадаючому порядку пропусків\n" +
                    "3 - Сортування у зростаючому порядку пропусків\n" +
                    "0 - Повернутися");
            line();

            String input = in.nextLine();

            switch (input){
                case "1":
                case "2":
                case "3":
                    break;
                case "0": return;
                default:

                    System.out.println("Не коректно введені дані");
                    line();
                    break;
            }
        }
    }
    public static void studentMenu(){

        while (true){
            line();
            System.out.println("1 - Вивести всі пропуски\n" +
                    "2 - Додати пропуск студенту\n" +
                    "3 - Видалити пропуск студенту\n" +
                    "4 - Оновити пропуск студенту\n" +
                    "5 - Пошук\n" +
                    "6 - Сортування\n" +
                    "0 - Повернутися");
            line();

            String input = in.nextLine();

            if(Objects.equals(input, "0")) break;

            switch (input){
                case "1":
                case "2":
                case "3":
                case "4":
                    break;
                case "5":
                    omissionsSearch();
                    break;
                case "6":
                    clientSort();
                    break;
                case "0":
                    return;
                default:

                    System.out.println("Не коректно введені дані");
                    line();
                    break;
            }
        }
    }

    public static void omissionsSearch(){

        while (true){
            line();
            System.out.println(
                    "1 - Пошук по імені\n" +
                            "2 - Пошук по прізвищу\n" +
                            "3 - Пошук по номеру телефона\n" +
                            "0 - Повернутися");
            line();
            String input = in.nextLine();

            switch (input){
                case "1":
                case "3":
                case "2":
                    break;
                case "0": return;
                default:

                    System.out.println("Не коректно введені дані");
                    line();
                    break;
            }
        }
    }

    public static void clientSort(){

        while (true){
            line();
            System.out.println("1 - Сортування за іменем у спадаючому порядку\n" +
                    "2 - Сортування за іменем у зростаючому порядку\n" +
                    "0 - Повернутися");
            line();

            String input = in.nextLine();

            switch (input){
                case "1":
                case "2":
                    break;
                case "0": return;
                default:
                    System.out.println("Не коректно введені дані");
                    line();
                    break;
            }
        }
    }
}
