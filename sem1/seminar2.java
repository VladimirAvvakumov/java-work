


import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class seminar2 {

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now(); // если хотим работать с временем текущим то этот класс(метод)Локалдататайм
        // Define a formatter for the desired pattern
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yy-MMMM-dd HH:mm:ss");// применяем класс дататаймформаттер для того
        DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");// чтобы распечатывалось время с датой так как нам надо

        Date now1 = new Date();//ещё один класс для работы с датой и текущим временем
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("E dd.MM.yyyy 'и время' HH:mm:ss");//преобразовываем переменную now1
        System.out.println("Текущая дата: " + formatForDateNow.format(now1));//выводим на экран преобразованную дату и время

        // Format the LocalDateTime using the formatter
        String formattedDate1 = now.format(df);//обращаемся к переменной now и вызваем метод format
        String formattedDate2 = now.format(sdf);

        // Print the formatted date
        System.out.println("Formatted (yyyy-mm-dd HH:mm:ss): " + formattedDate1);
        System.out.println("Formatted (dd/MM/yyyy HH:mm:ss): " + formattedDate2);

        // Print the original LocalDateTime object
        System.out.println("Now: " + now);

        double x = 5d / 2d;
        System.out.println(x);
    }

}