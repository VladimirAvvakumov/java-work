package lection1;

import java.io.*;

// чтение файла построчно с красивыми равняшками.
public class task23 {
    public static void main(String[] args) throws Exception {// throws Exeptions означает что мы ожидаем что может быть
                                                             // ошибка.
        // Создаём объект FileReader для чтения файла file.txt
        FileReader fr = new FileReader("file.txt");

        // Читаем символы из файла, пока не достигнем конца файла (-1)
        int c;
        while ((c = fr.read()) != -1) {
            char ch = (char) c; // Преобразуем прочитанный символ в тип char
            if (ch == '\n') { // Если символ является символом новой строки, выводим его
                System.out.print(ch);
            } else { // Иначе выводим символ без изменений
                System.out.print(ch);
            }
        }

        // Закрываем файл
        fr.close();

        // Создаём объект BufferedReader для чтения файла file.txt с буферизацией
        BufferedReader br = new BufferedReader(new FileReader("file.txt"));

        // Читаем строки из файла, пока не достигнем конца файла (null)
        String str;
        while ((str = br.readLine()) != null) {
            // Выводим каждую строку с префиксом "== " и суффиксом " ==\n"
            System.out.printf("== %s ==\n", str);
        }

        // Закрываем BufferedReader
        br.close();
    }
}
