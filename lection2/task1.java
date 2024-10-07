package lection2;

public class task1 { //программа для написания ста плюсов.
    public static void main(String[] args) {
        String str = "";
        for (int i = 0; i < 100; i++) {
            str += "+";
        }

        StringBuilder sb = new StringBuilder();//класс построитель строк
        for (int i = 0; i < 100; i++) {// программа для вывода на экран ста плюсов
            sb.append("+");
            System.out.println(sb);
        }

        var s = System.currentTimeMillis();//переменная var обладает динамической типизацией. сама подставит необходимое название переменной
        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append("+");
        }
        System.out.println(System.currentTimeMillis() -s);
        // примеры преобразования строк. Методы в конспекте.
        String[] name = { "C", "е", "р", "г", "е", "й" };
        String sk = "СЕРГЕЙ КА.";
        System.out.println(sk.toLowerCase()); // сергей ка. // метод переводит все буквы в нижний регистр
        System.out.println(String.join("", name)); // Cергей
        System.out.println(String.join("", "C", "е", "р", "г", "е", "й")); // C,е,р,г,е,й
        System.out.println(String.join(",", "C", "е", "р", "г", "е", "й"));

    }
}