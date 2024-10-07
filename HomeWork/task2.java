package HomeWork;

public class task2 {
    /**
     * Напишите функцию printPrimeNums, которая выведет на экран все простые числа
     * в промежутке от 1 до 1000, каждое на новой строке.
     * <p>
     * Напишите свой код в методе printPrimeNums класса Answer.
     * <p>
     * Пример
     * <p>
     * 2
     * 3
     * 5
     * 7
     * 11
     * ...
     * seminar2
     */


    private static void printPrimeNums(int n) {

        boolean b = true;
        for (int p = 2; p < n; p++) {
            for (int i = 2; i < p; i++) {
                if (p % i == 0) {
                    b = false;
                    break;
                }

            }
            if (b) {
                System.out.println(p);
            } else {
                b = true;
            }

        }
    }

    public static void main(String[] args) {

        printPrimeNums(1000);
    }
}


