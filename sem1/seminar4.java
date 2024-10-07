import java.io.*;


public class seminar4 {




//    private static void writeToFile(String path, String content) {
//   этот метод описан ниже в упращенном варианте
////        File file = new File(path);
//        FileWriter fw = null;
//
//        try {
//            fw = new FileWriter(path);
//            fw.write(content);
//            fw.flush();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } finally {
//            try {
//                fw.close();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }
//
//    }
// методы из статики вызываються только в статику

    public static void main(String[] args) {//текст что хотели сразу в файл записать ниже
        writeToFile("task3.txt", "Hello World\nBack to Ussr");//в блоке мэйн вызываем метод в котором передаем имя файла которрый создали
        readFile("task3.txt");// метод для прочтения содержимого файла
    }



    private static void writeToFile(String path, String content) {//переменные для записи строк
//        "E:\\code\\work\\gb\\JavaAPI\\example\\gb-java-example"
        // переменная Path будет заменена при вызове метода на имя файла
        try(FileWriter fw = new FileWriter(path)) { //ссылочный тип данных, метод, умеющий в файл записывать
            fw.write(content);// передаем программе, что хотим записать в этот файл контент
            fw.flush();// Необходимо для записи в файл в любом случае. Пока буфер не заполнен java может не записать в файл.
        } catch (IOException e) {// если возникнет ошибка ввода вывода
            throw new RuntimeException(e);
        }

    }

    private static String readFile(String path) {
        String line;

//        float f = 100000000000000000000000000.0f;
//        System.out.println(f);
//
        try(BufferedReader br = new BufferedReader(new FileReader(path))) {// метод бафиредридер читает построчно нашу информацию
            while ((line = br.readLine()) != null) {// в переменную line - то что прочитал буффирид ридер методом ридлайн пока не пусто
                System.out.println(line);// выводим на экран инфу
            }
        } catch (IOException e) {// Если возникает ошибка
            throw new RuntimeException(e);
        }
        return line;// возвращаем значение переменной Line
    }
}

