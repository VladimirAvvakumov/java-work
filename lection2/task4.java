package lection2;

import java.io.File;
import java.io.FileWriter;

public class task4 {

    public static void main(String[] args) {
        String line = "empty";
        try {
            // Получаем путь к проекту
            String pathProject = System.getProperty("user.dir");
            // Конкатенируем путь к файлу
            String pathFile = pathProject.concat("/file.txt");
            // Создаём объект файла
            File file = new File(pathFile);

            // Проверяем, существует ли файл
            if (file.createNewFile()) {
                System.out.println("file.created");
            } else {
                System.out.println("file.existed");
                // Создаём объект FileWriter для записи в файл
                FileWriter fileWriter = new FileWriter(file, true);
                // Записываем строку в файл
                fileWriter.write("new line");

                // Добавляем разделитель строк
                fileWriter.append(System.lineSeparator());

                // Записываем ещё две строки
                fileWriter.write("new line");
                fileWriter.append("new line агсл");
                // Очищаем буфер и закрываем файл
                fileWriter.flush();
                fileWriter.close();
            }
        } catch (Exception e) {
            // e.printStackTrace();
        } finally {
            System.out.println(line);
        }
    }
}



//Этот код создаёт новый файл file.txt 
//в директории проекта или добавляет текст в 
//существующий файл, если он уже есть. 
//В файл записываются три строки: 
//"new line", за которой следует разделитель строк 
//("\r\n" для Windows или "\n" для Unix), и ещё две строки "new line".