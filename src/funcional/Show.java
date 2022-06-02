package funcional;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Show {
    public static void show() {
        try (BufferedReader reader = new BufferedReader(new FileReader("Student.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

