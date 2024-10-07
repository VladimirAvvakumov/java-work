package lection3;

//Тип данных
// Object – «всему голова»
// Упаковка – любой тип можно положить в переменную типа Object
// Распаковка – преобразование Object-переменной в нужный тип
public class task1 {
    public static void main(String[] args) {
        Object o = 1;
        GetType(o);// java.lang.Integer тип обджект годится для любых переменных

        o = 1.2;
        GetType(o);// java.lang.Double
    }

    static void GetType(Object obj) {// метод для вывода информации  о типе переменной

        System.out.println(obj.getClass().getName());
    }
}

