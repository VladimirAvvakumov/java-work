package lection1;
import java .util.Scanner;

import javax.xml.validation.Validator;
//новый оператор метод 
public class task18 {
    public static void main(String[] args) {
        int month = 2; // Устанавливаем значение месяца в переменную

        String text = ""; // Инициализируем строку для хранения текста

        switch (month) { // Используем оператор switch для проверки значения месяца
            case 2: // Если месяц равен 2, устанавливаем текст в "Autumn"
                text = "Autumn";
                break; // Прерываем выполнение блока case
            default: // Если ни один из случаев не подходит, устанавливаем текст в "mistake"
                text = "mistake";
                break; // Прерываем выполнение блока default
        }

        System.out.println(text); // Выводим текст на экран
    }
}
