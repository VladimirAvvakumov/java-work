import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;


public class seminar3 {
   

 

    public static void main(String[] args) {

        System.out.println("Enter your name: ");//запрашиваем в консоли имя пользователя
//        String name = new Scanner(System.in).next();// ниже упрощенный вариант с присваиванием переменной
        Scanner sc = new Scanner(System.in);//Создаем переменную для сканера
        String name = sc.nextLine();// в переменную запоминаем имя пользователя
//        System.out.println("Your name = " + name);

        LocalDateTime now = LocalDateTime.now();//метод для вывода реального текущего времени
//переменная now отоброжает текущюю дату и время
        if (now.isBefore(LocalDateTime.of(LocalDate.now(), LocalTime.of(16, 0)))) {// проверяем если время до 16:00
            //если текущее время перед сегодняшним днем
            System.out.println("Good day, " + name + "!");//выводим добрый день имя пользователя
        }
//        else if(now.isAfter(LocalDateTime.of(LocalDate.now(), LocalTime.of(23, 0)))) {
//            System.out.println("Good evening, " + name + "!");
//        }
        else {
            System.out.println("Good evening, " + name + "!");
        }
    }

}
    

