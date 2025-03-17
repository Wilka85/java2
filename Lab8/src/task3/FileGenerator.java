package task3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class FileGenerator {
    private static final String FILE_F ="f.txt";
    public static void generateRandomFilesToFile(int count,int min,int max)
    {
        Random random = new Random();
        try(BufferedWriter writer=new BufferedWriter(new FileWriter(FILE_F))){
            for (int i =0;i<count;i++){
                int number = random.nextInt(max-min+1)+min;
                writer.write(number+"\n");
            }
            System.out.println("Случайные числа записаны в файл f.txt.");
        } catch (IOException e)
        {
            System.out.println("Ошибка при записи в файл f.txt.");
            throw new RuntimeException(e);
        }
    }
}
