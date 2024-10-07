package lection2;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
// рано или поздно системы начинают сбоить, и для того, чтобы понять где и как она сбоит, смотри ниже метод
public class task6 {
    public static void main(String[] args) throws IOException {
    // для записи логов программы
    // Logger logger = Logger.getLogger (Ваш класс.class.getName ());
    // logger.log (Level.INFO, “Дошёл до этой точки”);
        Logger logger = Logger.getLogger(task6.class.getName());// Для того, чтобы внедрить логирование, создаем переменную logger
        // и в гет логер указывваем наименование класса для которого мы будем это логирование добавлять
        //ConsoleHandler ch = new ConsoleHandler();
        //консоль хендлер выводит ошибки в терминал
        FileHandler fh = new FileHandler("log.txt");//метод для создания файла записи лога
        //logger.addHandler(ch);
        logger.addHandler(fh);//указываем в качастве аргумента(fh) для нашего логгера

        SimpleFormatter sFormat = new SimpleFormatter();//создать или описать формат в рамках которого будет производиться запись сообщений
        //XMLFormatter xml = new XMLFormatter();// формат вывода другого лога более детального для парсинга
        fh.setFormatter(sFormat);//
        //fh.setFormatter(xml);

        //logger.setLevel(Level.INFO);
        logger.log(Level.WARNING, "Тестовое логирование 1");// метод позволяет указать уровень опасности ошибки
        logger.info("Тестовое логирование 2");// и сообщение которое необходимо вывести
        //если не надо выводить опасность ошибки исползуем строку ниже
    }
}
