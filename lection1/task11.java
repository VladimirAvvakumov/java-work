package lection1;
// преобразования типов переменных
public class task11 {
    public static void main(String[] args) {
        int i =123; double d = i;
        System.out.println(i);// 123
        System.out.println(d);// 123.0
        d = 3.1415; i = (int)d;
        System.out.println(d);//3.1415
        System.out.println(i);// 3
        d = 3.9415; i = (int)d;
        System.out.println(d);// 3.9415
        System.out.println(i);// 3
        byte b = Byte.parseByte("123");
        System.out.println(b);
        b = Byte.parseByte("1234");// вышли за пределы памяти 1 байта.
        System.out.println(b);// Number format Exeption: valye out of range
    }
}
