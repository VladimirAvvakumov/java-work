package lection1;

// неявная типизация есть переменная которая на автомате подставит необходимое значение переменной
public class task7 {
    public static void main(String[] args) {
        var i = 123;// var подставит необходимое значение int bool bkb double
        System.out.println(i);
        var d = 123.435;
        System.out.println(d);
        System.out.println(getType(i));// С помощью метода grtType мы получаем тип нашей переменной если нам надо
        System.out.println(getType(d));
        d = 1022;
        System.out.println(d);
        // d = "mistake"
        //error: incompatible types:
        //String cannot be converted to double
    }

    static String getType(Object o) {

        return o.getClass().getSimpleName();
    }
}
