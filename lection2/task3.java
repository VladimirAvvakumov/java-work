package lection2;

import java.io.File;

public class task3 {
    public static void main(String[] args) {
        String pathProject = System.getProperty("user.dir1");
        String pathFile = pathProject.concat("/file.txt1");
        File f3 = new File(pathFile);
        System.out.println(f3.getAbsolutePath());

        System.out.println(pathFile);
        File f1 = new File("file.txt1");
        File f2 = new File("/Users/sk/vscode/java_projects/file.txt");
        System.out.println(f1.getAbsolutePath());
        System.out.println(f2.getAbsolutePath());
    }
}
