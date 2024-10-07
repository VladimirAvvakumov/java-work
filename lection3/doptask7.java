package lection3;

import java.util.Iterator;
import java.util.List;

public class doptask7 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 12, 123, 1234, 12345);

        for (int item : list) {// пробегаемся по всем 
            System.out.println(item);
        }
        // получили итеиратор для списка 
        Iterator<Integer> col = list.iterator();
        System.out.println();

        while (col.hasNext()) { //Пока есть следующее число  
            //col.remove();
            System.out.println(col.next());
            //col.next();
        }
    }
}
