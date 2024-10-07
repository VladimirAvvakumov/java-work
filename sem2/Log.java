package sem2;

import java.io.FileInputStream;
import java.util.logging.LogManager;
import java.util.logging.Logger;
public class Log {
    
    static {
        // открываем поток для чтения (переменная ин) считывать будем лог с расширением конфиг
        try(FileInputStream in = new FileInputStream("log.config")) {

            LogManager.getLogManager().readConfiguration(in);//класс логменеджер. хотим получить сам логменеджер(переменной ин)

        } catch (Exception e) {//ошибка если есть то в терминал
            e.printStackTrace();//выведет сообщение в консоль

        }
    }


    // статический метод для того чтобы можно было получить логгер из другой программы
    public static Logger getLogger(String className) {
        return Logger.getLogger(className);
    }
}

