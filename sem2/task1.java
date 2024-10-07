package sem2;
/**
 * Напишите метод, который вернет содержимое текущей папки в виде массива строк.
 * Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
 * Обработайте ошибки с помощью try-catch конструкции. В случае возникновения
 * исключения, оно должно записаться в лог-файл.
 * @param path
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class task1 {
    static final Logger LOGGER = Log.getLogger(task1.class.getName());// создали переменную логер и методом гетлоггер запустили логирование
    //метод гетнэйм спасает в случае если мы захотели переименовать класс.(то есть переименуеться на автомате)



    public static void main(String[] args) {
        writeToFile("lesson2.txt", "C:\\konspects");// передаем аргументы для работы метода.
    }  // певым идет название фала, который на автомате создастся, второе путь к файлу,который считываем.
        //

    // универсальный метод для считывания любых переданных в методе мейн папок
    public static List<String> readDir(String path) {
        File folder = new File(path);//создаем переменную Фолдер(папка)в этой переменной храниться ифа о папке с которой считываем
        // проверили что без файла мы не можем прочитать список файлов
        if (!folder.isDirectory()) {// если переменная фолдер не является папкой
            throw new RuntimeException("File is not directory");// извещаем пользователя,это не папка и на автомате выходим из метода
        }

        File[] files = folder.listFiles();//метод листфайлс вычитывает из папки все файлы
        // Листстринг (список строк) будет в переменной резалт
        List<String> result = new ArrayList<>();//в переменной резалт(тип данных список) создаем массив строк с именами файлов(сохраним в нём)

        for (File file : files) {// проходимся циклом по всем файлам в папке
            String name = file.getName();//у каждого файла по очереди берем имя
            result.add(name);//добавляем в переменную резалт имена файлов
            if (isThrow()) {//методом записываем в логи это ловушка для записи в лог 
                LOGGER.log(Level.INFO, "Error reading directory: " + folder.getAbsolutePath());
                //логгер запиши в лог уровень инфа "ошибка"
            }
        }

        return result;

    }

    public static void writeToFile(String pathIn, String pathOut) {//принимает путь к файлу который мы записываем и путь откуда записываем
        List<String> list = readDir(pathOut);// у нас есть лист строк который равен методу риддир(откуда вычитаем)
        // поток на запись заключаем в скобки
        try (FileWriter fw = new FileWriter(pathIn)) {//создали переменную фв и передали ей значение(путь) откуда будет метод будет вести запись
            for (String s : list) {// циклом по списку
                fw.write(s + "\n");//записываем строчку и переносим строку ниже
                fw.flush();// необходимо для записи в любом случае
                if (isThrow()) {//
                    LOGGER.log(Level.INFO, "Error writing directory: " + s);// в записи лога 
                }
            }
        } catch (Exception e) {// любое исключение,если оно возникло то
            e.printStackTrace();//распечатать ошибку в терминал
        }
    }

    private static boolean isThrow() {// метод ловушка для записи ошибок в логи
        // если вернулась 1 то будет запись в лог
        String str = "";

        int a = 0;
        int b = 2;
        int digit = a + (int) (Math.random() * b);// будет возвращать в логи и вконсоль нули и единицы
//        System.out.println(digit);
        return digit > 0;

    }
}
