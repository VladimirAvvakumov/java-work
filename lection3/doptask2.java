package lection3;

import java.util.ArrayList;

public class doptask2 {
    
    public static void main(String[] args) {
        // Создаем новый ArrayList, который будет хранить целые числа
        ArrayList<Integer> list = new ArrayList<Integer>();// коллекция типа массив
        //лист пронумерованный набор элементов. Имеется точечный контроль над тем где в списке вставляеться каждый элемент
        // Добавляем элемент в список
        list.add(2809);

        // Выводим все элементы списка на экран
        for (Object o : list) {
            System.out.println(o);
        }
    }

}
