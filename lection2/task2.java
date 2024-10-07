package lection2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

// Работа с файловой системой.
public class task2 {
    public static void main(String[] args) {
        // для работы с файлами надо использовать тип File , создаем переменную и указываем путь к файлу.
        File f1 = new File("file.txt"); //путь к файлу
        File f2 = new File("C:/WorkWithJava/file.txt");//абсолютный путь к файлу
//        String pathProject = System.getProperty("user.dir");
//        String pathFile = pathProject.concat("/file.txt");
//        File f3 = new File(pathFile);
//        System.out.println(f3.getAbsolutePath());
////         /Users / sk / vscode / java_projects / file.txt
////        C:/Users / Sk / Documents / xxx / brainexplosion / java / file.txt


        try {
            String pathProject = System.getProperty("C.WorkWithJava");
            String pathFile = pathProject.concat("/file.txt");
            File f3 = new File(pathFile);
            System.out.println("try");
        } catch (Exception e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }
// работа над ошибками
        try {
            String pathProject1 = System.getProperty("C.WorkWithJava"); //
            String pathFile1 = pathProject1.concat("/file.txt");
            File file = new File(pathFile1);
            if (file.createNewFile()) {
                System.out.println("file.created");
            } else {
                System.out.println("file.existed");
            }
        } catch (Exception e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }

//        String line = "empty";
//        try {
//            File file = new File(pathFile);
//            if (file.createNewFile()) {
//                System.out.println("file.created");
//            else{
//                    BufferedReader bufReader = new BufferedReader(new FileReader(file));
//                    System.out.println("file.existed");
//                    line = bufReader.readLine();
//                    bufReader.close();
//                }
//            } catch(Exception e){
//                //e.printStackTrace();
//            } finally{
//                System.out.println(line);
//            }
//
//
//        }
    }
}