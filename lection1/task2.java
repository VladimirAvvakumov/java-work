package lection1;

public class task2 {
    public static void main(String[] args) {
        String s = "3453"; // null для обозначения того что в переменной пусто
        System.out.println(s);
        
        System.out.println(s.charAt(2));// этот метод позволяет обратится к любому символу по индексу
        String g = "qwer";
        boolean b = s.length() >= 5 && s.charAt(4) == '1';// на примере показано как можно проверить 
        System.out.println(b);// необходимые нам вопросы по переменоой g. одну аперсанту не использовать
        //области видимости переменных
        int i = 123;
        System.out.println(i);

    }
    //System.out.println(i); тут выдаст ошибку то есть области видимости .
    
}

// short для переменных с маленьким значением 
// int для целочисленных переменных 4 байтовый
// System.out.println(s) для вывода на экран значений переменных
