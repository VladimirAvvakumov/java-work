package forthelessonwork;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class task5 {
    public static void main(String[] args) {
        // Создаем новый ArrayList, который будет хранить целые числа
        ArrayList<Integer> d = new ArrayList<>();

        // Добавляем два элемента в список
        d.add(1);
        d.add(123);

        // Перебираем все элементы списка и выводим их на экран
        for (Object i : d) {
            System.out.println(i); // Выводим каждый элемент как объект
            System.out.printf("%d", i); // Пытаемся преобразовать каждый элемент в целое число и вывести его как число
        }
    }
}
