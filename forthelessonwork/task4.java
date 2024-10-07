package forthelessonwork;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class task4 {
    static Logger log = Logger.getLogger(task4.class.getName());
    public static void main(String[] args) {
        writeToFile("file for praktic.txt", "C:\\Users\\birme\\OneDrive\\Изображения\\Снимки экрана" );

    }
// метод что то типо массива строк принимает не мейн
    public static List<String> readDir(String path) {//метод прочитать из папки принимает путь из какой папки будем читать
        File folder = new File(path);// создает новый объект класса File, который представляет файл или папку, расположенную по указанному 
        //пути (path).

        if(!folder.isDirectory()){// обработали возможную ошибку если не являеться папкой
            throw new RuntimeException("file is not directory");
        }
        File[] files = folder.listFiles();// получили список фалов
        List<String> result = new ArrayList<>();//создали список строк в котором будут храниться имена файлов

        for (File file : files) {//пробегаемся по списку файлов 
            String name = file.getName();//Инициализируем переменную и методом гетнейм спрашиваем имя файла 
            result.add(name);//добовляем в переменную имена всех файлов по очереди согласно циклу
            
        }
        
                
        return result;// возвращаем значение переменной Line
    }
    public static void writeToFile(String pathIn, String pathOut ) {
        List<String> list = readDir(pathOut);

        try(FileWriter fw = new FileWriter(pathIn)){//попытайся записать в переменную фв информацию на основе пути pathIn
            for (String s : list) {//проходим циклом по списку имен нашего списка полученного из метода
                fw.write(s + "\n");//записываем в переменную с переносом строки для легкости чтения
                fw.flush();// метод для того чтоб записалось 
            }  
        } catch (Exception e) {//обрабатываем возможную ошибку
            e.printStackTrace();//распечатать причину этой ошибки
        }
    }

}
