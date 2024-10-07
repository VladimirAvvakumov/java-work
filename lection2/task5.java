package lection2;
// предпочтительнее пользоваться библиотеками только необходимыми
// а такими как джава ай о. Реже, так как кампилятор скачивает сразу все библиотеки, а не только нужную нам
import java.io.*;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class task5 {
    static ByteOrder bOrder = ByteOrder.LITTLE_ENDIAN; //
    static Map<String, String> data = new HashMap<>(); //
    static Charset charset = StandardCharsets.UTF_8; //

    static void loadFile(String path) throws IOException {
        try (InputStream stream =
                     new BufferedInputStream(new FileInputStream(path))) {
            int n = readInt(stream);
            int b1;
            int b2;
            byte binWord[];
            byte binText[];
            for (int i = 0; i < n; i++) {
                binWord = new byte[readInt(stream)];
                binText = new byte[readInt(stream)];
                b1 = stream.read(binWord);
                b2 = stream.read(binText);
                if (b1 != binWord.length || b2 != binText.length)
                    throw new IOException("Error read file");
                data.put(new String(binWord, charset),
                        new String(binText, charset));
            }
        }
    } // метод для загрузки файла

    static void saveFile(String path) throws IOException {
        if (data.size() == 0)
            throw new IOException("Nothing to write");
        try (OutputStream stream = new BufferedOutputStream(new FileOutputStream(path, false))) {
            writeInt(stream, data.size());
            byte binWord[];
            byte binText[];
            for (Map.Entry<String, String> entry : data.entrySet()) {
                binWord = entry.getKey().getBytes(charset);
                writeInt(stream, binWord.length);
                binText = entry.getValue().getBytes(charset);
                writeInt(stream, binText.length);
                stream.write(binWord);
                stream.write(binText);
            }
        }
    } // метод для сохранения файла

    static void delete(String word) {
        data.remove(word);
    } // для удаления файла

    static void add(String word, String text) throws Exception {
        if (data.get(word) != null)
            throw new Exception("Word already exist");
        data.put(word, text);
    } // добавления каких то данных

    static String find(String word) {
        String out = data.get(word);
        if (out == null)
            return "не найдено";
        else
            return out;
    } // поиска


    static int readInt(InputStream in) throws IOException {
        byte out[] = new byte[4];
        int i = in.read(out);
        if (i != 4)
            throw new IOException("Error read file");
        return ByteBuffer.wrap(out).order(bOrder).getInt();
    } // добавление каких то блоков информации
    static void writeInt(OutputStream out, int num) throws IOException {
        ByteBuffer dbuf = ByteBuffer.allocate(4);
        dbuf.order(bOrder).putInt(num);
        out.write(dbuf.array());
    } //чтение данных из файла

    public static void main(String[] args) {
        String file = "test.bin"; //чтение файла
        //create file

        try {
            add("key1", "значение 1");//добавляем условный ключ и значение
            add("key2", "значение 2");//которое хранится по этому ключу
            add("key4", "значение 3");//
            saveFile(file);// Метод для сохранения данных в файл
        } catch (Exception e) {
            e.printStackTrace();//в этом блоке мы обрабатываем ошибку если таковая имеется
        }
        //read file

        try {// попытка чтения файла если вышла ошибка
            loadFile(file);//
            String key1 = "key1";//
            String key2 = "key2";//
            String key3 = "key3";//
            System.out.printf("%s: %s\n", key1, find(key1));// с помощью метода find пытаемся найти значение по имени ключа
            System.out.printf("%s: %s\n", key2, find(key2));//
            System.out.printf("%s: %s\n", key3, find(key3));// ищем ключ 3 а его нет смотри выше
        } catch (IOException e) { // в рамках выполнения метода find выведеться сообщение о том что не найден
            e.printStackTrace();//
        }
    } //
}
