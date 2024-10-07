package lection1;

import java.util.Scanner;
//метод для получений данных из терминала
public class task12 {
        public static void main(String[] args) {     // без паблик статик войд и строгих названий типа переменных не работает
        Scanner iScanner = new Scanner(System.in); // Метод встроенный scanner позволяет программе считывать написанное ползователем
        System.out.println("Введите имя:" );  // выводим в консоли надпись
        String name = iScanner.nextLine();// создали переменную name далее переводим написанное пользователем в след линию программы
        System.out.printf("Привет, %s", name);
        iScanner.close();
    }
}
