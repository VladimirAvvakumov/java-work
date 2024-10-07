package lection1;

public class task5 {
    public static void main(String[] args) {
        boolean flag1 = 123 <=234; // проверяем на правду или лож переменные
        System.out.println(flag1); // необходимый код для вывода переменных
        boolean flag2 = 123 >= 234;
        System.out.println(flag2);
        boolean flag3 = flag1 ^ flag2;//разделительная дизъюнкция определяеться вот таким символом
        System.out.println(flag3); 
    }
}
