package task3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileSplitter {
    private static final String FILE_F = "f.txt";
    private static final String FILE_G = "g.txt";
    private static final String FILE_H = "h.txt";
    public static void splitFiles(){
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();
        try (BufferedReader reader=new BufferedReader(new FileReader(FILE_F))){
            String line;
            while ((line = reader.readLine())!=null){
                int number = Integer.parseInt(line);
                if(number%2==0){
                    evenNumbers.add(number);
                }
                else {
                    oddNumbers.add(number);
                }
            }
        } catch (IOException e)
        {
            System.out.println("Ошибка при чтении файла f.txt.");
            throw new RuntimeException(e);
        }
        try (FileWriter writer = new FileWriter(FILE_G)) {
            for (int number : evenNumbers) {
                writer.write(number + "\n");
            }
            System.out.println("Чётные числа записаны в файл g.txt.");
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл g.txt.");
            throw new RuntimeException(e);
        }
        try (FileWriter writer = new FileWriter(FILE_H)) {
            for (int number : oddNumbers) {
                writer.write(number + "\n");
            }
            System.out.println("Нечётные числа записаны в файл h.txt.");
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл h.txt.");
            throw new RuntimeException(e);
        }
    }
}
