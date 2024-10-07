package forthelessonwork;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class task3 {
    public static void main(String[] args) {// метод создания файла и записи в него информации
        File f = new File("ussr");

        FileWriter fw = null;

        try { // необходимо для записи
            fw = new FileWriter(f);
            fw.write("bobby");// текст что записали
            fw.flush();
        } catch (Exception e) {
            System.out.println("Error" + e);
        } finally {//метод клоус не работает без блока try.
            try {
                fw.close();
            } catch (IOException e) {
                
               System.out.println("Stream not closet");
            }
        }
    }
}