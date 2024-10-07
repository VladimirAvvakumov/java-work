package lection3;

public class doptask1 {
    // static int[] AddItemInArray(int[] array, int item) {
    //     int length = array.length;// 

    //     int[] temp = new int[length + 1];//
    //     System.arraycopy(array, 0, temp, 0, length);//
    //     temp[length] = item;//
    //     return temp;
    // }
    // public static void main(String[] args) {
    //     int[] a = new int[] { 0, 9 };
    //     for (int i : a) { System.out.printf("%d ", i); }
    //     a = AddItemInArray(a, 11);// 
    //     a = AddItemInArray(a, 111);
    //     a = AddItemInArray(a, 1111);
    //     System.out.println();
    //     for (int j : a) { System.out.printf("%d ", j); }
    //     System.out.println();
    // }


     // Метод AddItemInArray добавляет элемент в конец массива.
    // Принимает на вход массив и элемент, который нужно добавить.
    // Возвращает новый массив с добавленным элементом.
    static int[] AddItemInArray(int[] array, int item) {
        int length = array.length; // Получаем длину входного массива.

        int[] temp = new int[length + 1]; // Создаём новый массив с длиной на 1 больше, чем входной.
        System.arraycopy(array, 0, temp, 0, length); // Копируем элементы входного массива в новый массив.
        temp[length] = item; // Добавляем элемент в конец нового массива.
        return temp; // Возвращаем новый массив.
    }

    public static void main(String[] args) {
        int[] a = new int[] { 0, 9 }; // Создаём массив из двух элементов.
        for (int i : a) { // Выводим элементы массива.
            System.out.printf("%d ", i);
        }

        a = AddItemInArray(a, 11); // Добавляем элемент 11 в конец массива.
        a = AddItemInArray(a, 111); // Добавляем элемент 111 в конец массива.
        a = AddItemInArray(a, 1111); // Добавляем элемент 1111 в конец массива.

        System.out.println(); // Переводим строку.

        for (int j : a) { // Выводим элементы обновлённого массива.
            System.out.printf("%d ", j);
        }

        System.out.println(); // Переводим строку.
    }
}



// Этот код создаёт статический метод AddItemInArray,
//  который принимает на вход массив array и элемент item,
//   который нужно добавить в конец массива.
//    Метод создаёт новый массив temp с длиной на 1 больше, 
//    чем длина входного массива, копирует элементы входного массива 
//    в новый массив, используя метод System.arraycopy, 
//    и добавляет элемент в конец нового массива. 
//    Затем метод возвращает новый массив.
// В методе main создаётся массив a из двух элементов, 
// затем вызывается метод AddItemInArray три раза с разными 
// значениями элемента для добавления. После каждого вызова 
// метода AddItemInArray выводится содержимое массива a.
 
