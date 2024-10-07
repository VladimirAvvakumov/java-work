package forthelessonwork;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        // Инициализируем сканер для чтения ввода с клавиатуры
        Scanner iScanner = new Scanner(System.in);

// Выводим приглашение для ввода целого числа
        System.out.println("int a: ");

// Считываем целое число с клавиатуры и сохраняем его в переменную x
        int x = iScanner.nextInt();

// Выводим приглашение для ввода вещественного числа
        System.out.println("double a: ");

// Считываем вещественное число с клавиатуры и сохраняем его в переменную y
        double y = iScanner.nextDouble();

// Выводим сумму чисел x и y, используя форматированный вывод
        System.out.printf("%d+%f=%f", x, y, x + y);

// Закрываем сканер, чтобы освободить ресурсы
        iScanner.close();

    }
}
