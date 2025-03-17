package task5;

import javax.imageio.IIOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NumberWriter {
    private static final String FILE_NAME ="f.txt";
    public static void writeNumbers(){
        try(Scanner scanner = new Scanner(System.in);
            BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))){
            System.out.println("Введите 10 чисел");
            for (int i=0;i<10;i++){
                while (!scanner.hasNextInt()){
                    System.out.println("Введите корректное число");
                    scanner.next();
                }
                int number = scanner.nextInt();
                writer.write(number+"\n");
            }
            System.out.println("Числа записаны");
        } catch (IOException e) {
            System.out.println("Ошибка записи");
            throw new RuntimeException(e);
        }
    }
}
