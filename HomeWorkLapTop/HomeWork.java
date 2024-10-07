package HomeWorkLapTop;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

class Laptop {// характеристики 
    private String model;
    private int ram;
    private int hddCapacity;
    private String os;
    private String color;
    private double price;

    public Laptop(String model, int ram, int hddCapacity, String os, String color, double price) {
        this.model = model;             //код создаёт конструктор класса Laptop,     
        this.ram = ram; //который принимает шесть параметров: model, ram, hddCapacity, os, color и price.
        this.hddCapacity = hddCapacity;// Эти параметры используются для инициализации соответствующих полей объекта Laptop
        this.os = os;
        this.color = color;
        this.price = price;
    }
    
    public int getRam() { return ram; }//Геттеры для доступа к полям объекта Laptop. 
    public int getHddCapacity() { return hddCapacity; }//Они возвращают значения полей ram, hddCapacity, os, color и price соответственно.
    public String getOs() { return os; }
    public String getColor() { return color; }
    public double getPrice() { return price; }

    @Override
    public String toString() {//Метод возвращает строковое представление объекта Laptop, 
        return "Laptop{" +    //// которое включает в себя значения всех его полей:
                "model='" + model + '\'' +
                ", ram=" + ram +
                ", hddCapacity=" + hddCapacity +
                ", os='" + os + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}

class LaptopStore {
    private Set<Laptop> laptops;// Набор ноутбуков
    private Random random;// Генератор случайных чисел

    public LaptopStore() {
        laptops = new HashSet<>();// Инициализация набора ноутбуков пустым набором
        random = new Random();// Создание генератора случайных чисел
    }

    public void generateLaptops(int count) {
        String[] models = {"Dell", "HP", "Lenovo", "Asus", "Acer", "Apple", "MSI", "Huawei"};//массив моделей ноутбуков
        int[] ramOptions = {4, 8, 16, 32, 64};//массив оперативной памяти   
        int[] hddOptions = {256, 512, 1024, 2048};//массив жесткий диск
        String[] osOptions = {"Windows", "MacOS", "Linux"};// массив ос
        String[] colorOptions = {"Black", "Silver", "White", "Blue", "Red"};//массив цветов

        for (int i = 0; i < count; i++) {
            String model = models[random.nextInt(models.length)] + "-" + (i + 1);//Модель ноутбука (model) формируется путём случайного выбора модели из массива models и добавления номера ноутбука (i + 1).
            int ram = ramOptions[random.nextInt(ramOptions.length)];//Объём оперативной памяти (ram) выбирается случайным образом из массива ramOptions.
            int hddCapacity = hddOptions[random.nextInt(hddOptions.length)];//Ёмкость жёсткого диска (hddCapacity) также выбирается случайным образом из массива hddOptions.
            String os = osOptions[random.nextInt(osOptions.length)];//Операционная система (os) выбирается случайным образом из массива osOptions.
            String color = colorOptions[random.nextInt(colorOptions.length)];//Цвет ноутбука (color) выбирается случайным образом из массива colorOptions.
            double price = 500 + random.nextDouble() * 2500; // Цена от 500 до 3000

            laptops.add(new Laptop(model, ram, hddCapacity, os, color, Math.round(price * 100.0) / 100.0));//ноутбук с этими характеристиками добавляется в коллекцию laptops.
        }
        
    }
    public void displayAllLaptops() {//метод отображает все доступные ноутбуки в коллекции laptops.
        System.out.println("Все доступные ноутбуки:");//выводим на экран сообщение
        for (Laptop laptop : laptops) {//циклом пробегаемся по всем элементам коллекции 
            System.out.println(laptop);//каждый ноут выводится на экран
        }
        System.out.println("Всего ноутбуков: " + laptops.size());//выводится количество ноутбуков в коллекции
    }

    public void filterLaptops() {//метод предлагает пользователю выбрать критерии фильтрации ноутбуков. Пользователь может выбрать один из следующих критериев:
        Map<String, Object> filters = new HashMap<>();//
        Scanner scanner = new Scanner(System.in);//

        while (true) {//критерии выбора
            System.out.println("Введите цифру, соответствующую необходимому критерию:");
            System.out.println("1 - ОЗУ");
            System.out.println("2 - Объем ЖД");
            System.out.println("3 - Операционная система");
            System.out.println("4 - Цвет");
            System.out.println("5 - Цена");
            System.out.println("0 - Завершить ввод");

            int choice = scanner.nextInt();
            if (choice == 0) break;

            switch (choice) {//оператор switch для обработки различных вариантов ввода пользователя.
                case 1://Программа выводит запрос на ввод объёма ОЗУ и сохраняет введённое значение в карту filters под ключом «ram».
                    System.out.println("Введите объем ОЗУ:");
                    filters.put("ram", scanner.nextInt());//
                    break;
                case 2://Программа выводит запрос на ввод объёма ЖД и сохраняет введённое значение в карту filters под ключом «hddCapacity».
                    System.out.println("Введите объем ЖД:");
                    filters.put("hddCapacity", scanner.nextInt());//
                    break;
                case 3://Программа выводит запрос на ввод операционной системы и сохраняет введённое значение в карту filters под ключом «os».
                    System.out.println("Введите операционную систему:");
                    filters.put("os", scanner.next());
                    break;
                case 4://Программа выводит запрос на ввод цвета и сохраняет введённое значение в карту filters под ключом «color».
                    System.out.println("Введите цвет:");
                    filters.put("color", scanner.next());
                    break;
                case 5://Программа выводит запрос на ввод максимальной цены и сохраняет введённое значение в карту filters под ключом «price».
                    System.out.println("Введите максимальную цену:");
                    filters.put("price", scanner.nextDouble());
                    break;
            }
        }
        // переменная будет содержать отфильтрованные ноутбуки. 
        Set<Laptop> filteredLaptops = new HashSet<>(laptops);//выполняем фильтрацию коллекции ноутбуков (laptops) на основе заданных фильтров (filters). 
        for (Laptop laptop : laptops) {//выполняется цикл по каждому ноутбуку из исходной коллекции (laptops).
            if (filters.containsKey("ram") && laptop.getRam() < (int) filters.get("ram")) {
                filteredLaptops.remove(laptop);//фильтрация по параметрам оперативной памяти
            }
            if (filters.containsKey("hddCapacity") && laptop.getHddCapacity() < (int) filters.get("hddCapacity")) {
                filteredLaptops.remove(laptop);//фильтрация по параметрам жесткого диска
            }
            if (filters.containsKey("os") && !laptop.getOs().equalsIgnoreCase((String) filters.get("os"))) {
                filteredLaptops.remove(laptop);//фильтрация по параметрам операционная система
            }
            if (filters.containsKey("color") && !laptop.getColor().equalsIgnoreCase((String) filters.get("color"))) {
                filteredLaptops.remove(laptop);//фильтрация по параметрам цвет
            }
            if (filters.containsKey("price") && laptop.getPrice() > (double) filters.get("price")) {
                filteredLaptops.remove(laptop);//фильтрация по цене
            }
        }

        System.out.println("Отфильтрованные ноутбуки:");//выводим отфильтрованные ноутбуки
        for (Laptop laptop : filteredLaptops) {
            System.out.println(laptop);
        }
    }
}


public class HomeWork {
     public static void main(String[] args) {
        LaptopStore store = new LaptopStore();
        store.generateLaptops(100);

        Scanner scanner = new Scanner(System.in);//чтение ввода с клавиатуры и объявляет переменную choice для хранения выбранного действия.
        int choice;

        do {//Цикл do-while повторяется до тех пор, пока пользователь не выберет действие «Выйти»
            System.out.println("Не без помощи друзей написано");
            System.out.println("\n =) Магазинчик ноутбуков =)");
            System.out.println("1. все ноутбуки");
            System.out.println("2. Отфильтровать ноутбуки");
            System.out.println("0. Выйти");
            System.out.print("Выберите действие: ");

            choice = scanner.nextInt();//В каждой итерации цикла программа выводит меню выбора действий, 
            //считывает выбранный пункт с помощью метода nextInt()

            switch (choice) {
                case 1://Если пользователь выбирает действие «Показать все ноутбуки»,
                // программа вызывает метод displayAllLaptops() класса LaptopStore.
                    store.displayAllLaptops();
                    break;
                case 2://Если пользователь выбирает действие «Отфильтровать ноутбуки», 
                //программа вызывает метод filterLaptops() 
                    store.filterLaptops();
                    break;
                case 0://Если пользователь выбирает действие «Выйти», программа выводит сообщение «До свидания!» и завершает работу.
                    System.out.println("До свидания!Спассибо за вводный курс по джаве");
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }

        } while (choice != 0);

        scanner.close();//закрываем сканер
    }
}
