package task1;

import java.io.File;

public class FilePrintInfo {
    public static void printInfo(){
        File file = new File("info.txt");
        if (file.exists()){
            System.out.println("Информация о файле:");
            System.out.println("Имя файла: " + file.getName());
            System.out.println("Путь: " + file.getAbsolutePath());
            System.out.println("Размер: " + file.length() + " байт");
            System.out.println("Файл доступен для чтения: " + file.canRead());
            System.out.println("Файл доступен для записи: " + file.canWrite());
        }
        else {
            System.out.println("Файл не найден.");
        }
    }
}
