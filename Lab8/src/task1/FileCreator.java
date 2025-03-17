package task1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreator {
    public static void createFile(){
        File file = new File("info.txt");
        try{
            if (file.createNewFile()){
                System.out.println("Файл создан: "+file.getName());
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))){
                    writer.write("Alex\n");
                    writer.write("19\n");
                    writer.write("student");
                }
            }

        } catch (IOException e)
        {
            System.out.println("Ошибка при создании файла.");
            throw new RuntimeException(e);
        }
    }
}
