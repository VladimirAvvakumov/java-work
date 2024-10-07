package sem2;

import java.io.File;
import java.io.FileWriter;
import java.time.LocalDateTime;

// работа с логами
public class task3 {
    public static void main(String[] args) {

        foo();
    }

    private static void foo() {
        // Инициализируем строку, содержащую текст, который будет записан в файл
        String str = "Hello World";

        // Создаём объект File, представляющий файл, в который будет произведена запись
        File f = new File("hello.txt");

        // Инициализируем объект FileWriter, который будет использоваться для записи в
        // файл
        FileWriter fw = null;
        try {
            fw = new FileWriter(f);// открываем поток для записи в файл
            fw.write(str);// записываем в файл данные из файла стр
            fw.flush();// необходимо для записи
            // в блоке кетч обрабатывается ошибка
        } catch (Exception e) {
            System.out.println("Error: " + e);
            // блоков кетч может быть несколько
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {// выполнится в любом случае
            try {
                fw.close();// закроем файл после работы
            } catch (Exception e) {// если есть ошибка, то выведем сообщение поток не закрыт
                System.out.println("Error: Stream can not closed");
            }
        }

    }
}