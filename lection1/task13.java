package lection1;

import java.util.Scanner;// Импортируем класс Scanner

/**
 * task13
 */
public class task13 {

    public static void main(String[] args) {// создали сканер для считывания из консоли

        // Создаём новый экземпляр класса Scanner для чтения ввода с клавиатуры
        Scanner iScanner = new Scanner(System.in);

        // Выводим подсказку для ввода целого числа
        System.out.printf("int a: ");

        // Считываем целое число с клавиатуры и сохраняем его в переменной x
        int x = iScanner.nextInt();

        // Выводим подсказку для ввода дробного числа
        System.out.printf("double a: ");

        // Считываем дробное число с клавиатуры и сохраняем его в переменной y
        double y = iScanner.nextDouble();

        // Вычисляем сумму чисел x и y и выводим результат
        System.out.printf("%d + %f = %f", x, y, x + y);

        // Закрываем сканер, чтобы освободить ресурсы
        iScanner.close();

    }
}