package lection1;

import java.util.Scanner;

public class task14 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("int a: ");
        boolean flag = iScanner.hasNextInt(); // метод hasnextint проверяет строку пользователя на числа ли это
        System.out.println(flag);
        int i = iScanner.nextInt();// если были введены цыфры то с помощью этого кода выводим на экран
        System.out.println(i);
        iScanner.close();
    }
}
