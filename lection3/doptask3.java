package lection3;

import java.util.ArrayList;

public class doptask3 {
    public static void main(String[] args) {
        // Создаем три новых ArrayList, которые будут хранить целые числа
        ArrayList<Integer> list1 = new ArrayList<Integer>(); //всё же это коллекции надо помнить
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>(10);

        // Создаем еще один ArrayList, который будет содержать те же элементы, что и
        // list3
        ArrayList<Integer> list4 = new ArrayList<>(list3);

        // Выводим содержимое list3 на экран
        System.out.println(list3);

        // Добавляем элемент в list3
        list3.add(123);

        // Выводим содержимое list3 на экран еще раз
        System.out.println(list3);
    }

}
