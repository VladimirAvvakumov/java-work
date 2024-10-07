package sem2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

//Дано четное число N (>0) и строки c1 и c2, которые следует учитывать как 1 символ.
//Написать метод, который вернет строку длины N*2,
// которая состоит из чередующихся последовательностей c1 и c2, начиная с c1.
//
public class task2 {
    public static void main(String[] args) {
        task1(10);
    }

    public static void task1(int n) {
        // Создаём две константы для удобства
        String c1 = "c1";
        String c2 = "c2";
        // Создаём объект StringBuilder для построения строки
        StringBuilder result = new StringBuilder();
        // Вычисляем количество итераций цикла
        int k = n * 2;
        // Организуем цикл, который выполнится k раз
        for (int i = 0; i < k; i++) {
            // Добавляем символы c1 и c2 в StringBuilder
            result.append(c1);
            result.append(c2);
        }
        // Выводим результат в консоль
        System.out.println(result);
    }
}
