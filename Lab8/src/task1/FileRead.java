package task1;

import java.io.*;
import java.util.Scanner;

public class FileRead {
    public static void readFromFile()
    {
        File file = new File("info.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
            System.out.println("Содержимое файла:");
            String line;
            while ((line= reader.readLine())!=null)
            {
                System.out.println(line);
            }
        }
        catch (IOException e){
            System.out.println("Файл не найден.");
            throw new RuntimeException(e);
        }
    }
}
