package task4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TemperatureWriter {
    private static final String FILE_NAME= "temperatures.txt";
    public static void writeTemperatures(){
        try (Scanner scanner = new Scanner(System.in);
             BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))){
            System.out.println("Введите 15 температур:");
            for (int i = 0; i < 15; i++) {
                while (!scanner.hasNextDouble()){
                    System.out.println("Введите корректное число");
                    scanner.next();
                }
                double temperature = scanner.nextDouble();
                writer.write(temperature+"\n");
            }
            System.out.println("Температуры записаны");
        } catch (IOException e){
            System.out.println("Ошибка записи");
            throw new RuntimeException(e);
        }
    }
}
