package lection1;

// примитив == обертка
// int  == Integer
// short == Short
// long == Long
// byte == Byte
// float == Float
// double == Double
// char == Character
// boolean == Boolean

//С помощью обертки мы можем провернуть много обераций в том числе преобразование строки из типа в тип
public class task8 {// так же узнать максимальное количество чисел в значении int
    public static void main(String[] args) {
        int f = 12_999_23;// можно разделять число подчеркиванием это ничего не изменит
        System.out.println(f);
        System.out.println(Integer.MAX_VALUE);// запрашиваем максимальное значение обёртки Integer/
    }
}
