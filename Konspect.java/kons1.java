/**


 часто востребованные методы

Важно: создавайте единственный сканнер на всю программу. Держите открытым, пока он нужен
 Scanner scanner = new Scanner (System.in, "CP866");// для ввода через терминал необходимо запустить сканер
 int number = scanner.nextInt (); // читает целочисленные значения
 String str = scanner.next (); // читает 1 слово
 String line = scanner.nextLine (); // читает до Enter
 scanner.close ();//необходимо после завершения ввода и считывания данных . так же необходим импорт файлов


 // Инициализируем сканер для чтения ввода с клавиатуры
 Scanner iScanner = new Scanner(System.in);

 // Выводим приглашение для ввода целого числа
 System.out.println("int a: ");

 // Считываем целое число с клавиатуры и сохраняем его в переменную x
 int x = iScanner.nextInt();

 // Выводим приглашение для ввода вещественного числа
 System.out.println("double a: ");

 // Считываем вещественное число с клавиатуры и сохраняем его в переменную y
 double y = iScanner.nextDouble();

 // Выводим сумму чисел x и y, используя форматированный вывод
 System.out.printf("%d+%f=%f", x, y, x + y);

 // Закрываем сканер, чтобы освободить ресурсы
 iScanner.close();



 длинна строки                        length()
 символ по индексу                    charAt()
 подстрока                            substr(Старт,длинна)   s.substr (0, 2) — первые 2 буквы
 от этого места до конца              substr(старт)          s.substr (1) — всё, кроме 0-го символа
 для Foreach                          toCharArray()          for (char c : str.toCharArray ())
 распилить строки по пробелам         split()                String[] parts = str.split (’ ‘);
 найти и заменить                     replace(что,чем)
 проверка на равенство строк          equals                 if (str1.equals (str2))
 сравнить другой строкой по алфавиту  compareTo              if (str1.compareTo (str2) < 0)


 как  запускать стримбилдер
 StringBuilder sb = new StringBuilder ();
 sb.append (c);
 sb.append (str);
 return sb.toString ();

 для записи логов программы
 Logger logger = Logger.getLogger (Ваш класс.class.getName ());
 logger.log (Level.INFO, “Дошёл до этой точки”);

Использование
Logger logger = Logger.getLogger()
Уровни важности
        INFO, DEBUG, ERROR, WARNING и др.
Вывод
ConsoleHandler info = new ConsoleHandler();
log.addHandler(info);
Формат вывода: структурированный, абы как* XMLFormatter, SimpleFormatte





 для создания нового файла
 try (FileWriter writer = new FileWriter ("имя файла")) {
 	writer.append (…);
 }
 catch (IOException ex) {
 	System.out.println ("Error: " + ex.getMessage ());
 }


для прочтения информации
 try (Readable reader = new BufferedReader (new FileReader (”имя файла”)) {
 	String line;
 	while ((line = reader.readLine () != null) {
 		System.out.println (line);
 	}
 }
 catch (IOException ex) {
 	System.out.println ("Error: " + ex.getMessage ());
 }


 это из семинара 2 . необходимый функционал для записи собственного лога в файл.

 для разбора немного позже
 # указываем обработчики логов - файловый и консольный
 handlers = java.util.logging.FileHandler, java.util.logging.ConsoleHandler

 # все логи уровня инфо и выше
 java.util.logging.FileHandler.level     = INFO

 # класс который отвечает за форматирование логов в файл
 java.util.logging.FileHandler.formatter = java.util.logging.SimpleFormatter

 # append    = true чтобы шла дозапись файла
 java.util.logging.FileHandler.append    = true

 # паттерн для создания строки в нужном формате
 java.util.logging.FileHandler.pattern   = log.%u.%g.txt

 # с какого уровня будем выводить сообщения в консоль
 java.util.logging.ConsoleHandler.level     = INFO
 # класс который отвечает за форматирование логов в консоль
 java.util.logging.ConsoleHandler.formatter = java.util.logging.SimpleFormatter

 примитивные типы
 примитив == обертка
 int  == Integer
 short == Short
 long == Long
 byte == Byte
 float == Float
 double == Double
 char == Character
 boolean == Boolean

метод equals проверяет равенство обьектов по значению.

Работа со строками String

concat(): объединение строк
valueOf(): преобразует Object в строковое представление (завязан на toString())
join(): объединяет набор строк в одну с учетом разделителя
charAt(): получение символа по индексу
indexOf(): первый индекс вхождения подстроки
lastIndexOf(): последний индекс вхождения подстроки
startsWith()/endsWith(): определяет, начинается/заканчивается ли строка с подстроки
replace(): замена одной подстроки на другую
trim(): удаляет начальные и конечные пробелы
substring(): возвращает подстроку, см.аргументы
toLowerCase()/toUpperCase(): возвращает новую строку в нижнем/верхнем регистре
сompareTo(): сравнивает две строки
equals(): сравнивает строки с учетом регистра
equalsIgnoreCase(): сравнивает строки без учета регистра
regionMatches(): сравнивает подстроки в строках

  Работа с Файлами необходимые методы
try {
 Код, в котором может появиться ошибка }
 catch (Exception e) { в этом блоке надо описать как реагировать на эту ошибку(то есть что то типа файла нет или введите положительное число)
 Обработка, если ошибка случилась }
 finally {
 Код, который выполнится в любом случае }


 для работы с файловой системой
isHidden(): возвращает истину, если каталог или файл является скрытым
length(): возвращает размер файла в байтах
lastModified(): возвращает время последнего изменения файла или каталога
list(): возвращает массив файлов и подкаталогов, которые находятся в каталоге
listFiles(): возвращает массив файлов и подкаталогов, которые находятся в определенном каталоге
mkdir(): создает новый каталог renameTo(File dest): переименовывает файл или каталог
length(): возвращает размер файла в байтах
lastModified(): возвращает время последнего изменения файла или каталога
list(): возвращает массив файлов и подкаталогов, которые находятся в каталоге
listFiles(): возвращает массив файлов и подкаталогов, которые находятся в определенном каталоге
mkdir(): создает новый каталог renameTo(File dest): переименовывает файл или каталог


 Тип данных Object – «всему голова»
 Упаковка – любой тип можно положить в переменную типа Object
 Распаковка – преобразование Object-переменной в нужный тип

спецификаторы для вывода через принт
 %d: Вывод целочисленных значений
 %x: для вывода шестнадцатеричных чисел
 %f: для вывода с плавающей точкой
 %e: для вывода чисел в экспоненциальной форме
 %c: для вывода одиночного символа
 %s: для вывода строчного значения



 Функционал с коллекциями
 add(args) – добавляет элемент в список ( в т.ч. на нужную позицию)
 get(pos) – возвращает элемент из списка по указанной позиции
 indexOf(item) – первое вхождение или -1
 lastIndexOf(item) – последнее вхождение или -1
 remove(pos) – удаление элемента на указанной позиции и его возвращение
 set(int pos, T item) – gjvtoftn значение item элементу, который находится
 на позиции pos
 void sort(Comparator) – сортирует набор данных по правилу
 subList(int start, int end) – получение набора данных от позиции start до end

 clear() – очистка списка
 toString() – «конвертация» списка в строку
 .asList – преобразует массив в список
 containsAll(col) – проверяет включение всех элементов из col
 removeAll(col) – удаляет элементы, имеющиеся в col
 retainAll(col) – оставляет элементы, имеющиеся в col
 toArray() – конвертация списка в массив Object’ов
 toArray(type array) – конвертация списка в массив type
 List.copyOf(col) – возвращает копию списка на основе имеющегося
 List.of(item1, item2,...) – возвращает неизменяемый список







 */