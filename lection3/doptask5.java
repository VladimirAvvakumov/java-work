package lection3;

import java.util.Arrays;
import java.util.List;

public class doptask5 {
    public static void main(String args[]) {
        // Создаем три новых StringBuilder для хранения дня, месяца и года
        StringBuilder day = new StringBuilder("28");
        StringBuilder month = new StringBuilder("9");
        StringBuilder year = new StringBuilder("1990");

        // Создаем массив из трех StringBuilder
        StringBuilder[] date = new StringBuilder[] { day, month, year };

        // Преобразуем массив в список
        List<StringBuilder> d = Arrays.asList(date);

        // Выводим содержимое списка на экран
        System.out.println(d); // [29, 9, 1990]

        // Меняем значение второго элемента массива (месяца) на "09"
        date[1] = new StringBuilder("09");

        // Выводим содержимое списка на экран еще раз
        System.out.println(d); // [29, 09, 1990]
    }
}
