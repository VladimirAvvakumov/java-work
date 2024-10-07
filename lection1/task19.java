package lection1;

public class task19 {
    public static void main(String[] args) {
        int a = 123;
        switch (a) { // проверка переменной а
            case 1:// если значение в кейсе не сходиться со значением переменной то выполниться брейк.
                System.out.println("a");
                break;
            case 123:
                System.out.println("a");
                break;
            default:// необязательное значение .
                System.out.println("не то число");
                break;
        }
    }

}
