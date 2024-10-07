package lection1;
// работа с файлами создание файла и дозапись
import java.io.FileWriter;// необходимы импорт
import java.io.IOException;

public class task22 {//new означает что связали ваш файл с переменной ,что до равно
    public static void main(String[] args) {// экземпляр класса файрайтер в котором передаеться имя файла и оргумент
        try(FileWriter fw = new FileWriter("file.txt", false)) {//фолс или тру в зависимости от того нужно нам его будет дописывать или нет.
            fw.write("line 1");// запись в файл 
            fw.append('\n');// переход на новую строку
            fw.append('2');//новая запись с новой строки
            fw.append('\n');// снова переход на новую строку
            fw.append("xFiles");
            fw.append('\n');
            fw.write("line 3");//снова новая запись
            fw.flush();
        } catch (IOException ex) {// с помощью блока IOEXEption мы проверяем файл на "есть ли в нем ошибка"
            System.out.println(ex.getMessage());//выводим на экран сообщение об ошибке если она присутсвует.
        }
    }
}
