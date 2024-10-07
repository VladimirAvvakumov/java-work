package lection1;

public class task17 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 0;
        if (a > b) c = a;
        if (b > a) c = b;

        System.out.println(c);

        //теринарный оператор 
        int t = 1;
        int n = 2;
        int min = t < n ? a : b;// если условие т меньше н выполняеться то в мин будет записано а
        System.out.println(min);// если не выполняеться то будет записано значение б
    }
}
