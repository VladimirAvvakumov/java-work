// Написать программу, которая запросит пользователя ввести <Имя> в консоли.
//  “Привет, <Имя>!” Получит введенную строку и выведет в консоль сообщение 

// В консоли запросить имя пользователя. В зависимости от текущего времени,
// вывести приветствие вида "Доброе утро, <Имя>!", 
// если время от 05:00 до 11:59 "Добрый день, <Имя>!", 
// если время от 12:00 до 17:59; "Добрый вечер, <Имя>!", 
// если время от 18:00 до 22:59; "Доброй ночи, <Имя>!", 
// если время от 23:00 до 4:59

import java.util.Scanner;

/**
 * seminar1
 */
public class seminar1 {

    public static void main(String[] args) {     // без паблик статик войд и строгих названий типа переменных не работает
        Scanner iScanner = new Scanner(System.in); // Метод встроенный scanner позволяет программе считывать написанное ползователем
        System.out.println("Введите имя:" );  // выводим в консоли надпись
        String name = iScanner.nextLine();// создали переменную name далее переводим написанное пользователем в след линию программы
        System.out.printf("Привет, %s", name);
        iScanner.close();
    }
}