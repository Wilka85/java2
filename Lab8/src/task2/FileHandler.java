package task2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileHandler {
    private static final String FILE_NAME="task2.txt";
    public static void writeNumbers(){
        try (Scanner scanner = new Scanner(System.in);
             BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))){
            System.out.println("Введите 10 целых чисел:");
            for (int i =0;i<10;i++){
                while (!scanner.hasNextInt()){
                    System.out.println("Введите целое число:");
                    scanner.next();
                }
                int number = scanner.nextInt();
                writer.write(number+"\n");
            }
            System.out.println("Числа успешно записаны в файл.");
        } catch (IOException e){
            System.out.println("Ошибка при записи в файл.");
            throw new RuntimeException(e);
        }
    }
    public static void readNumbers(){
        List<Integer> numbers = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line=reader.readLine())!=null)
            {
                try {
                    numbers.add(Integer.parseInt(line));
                } catch (NumberFormatException e) {
                    System.out.println("Некорректные данные в файле, пропускаем: " + line);
                }
            }
        } catch (IOException e){
            System.out.println("Ошибка при чтении из файла.");
            throw new RuntimeException(e);
        }
        if (!numbers.isEmpty()){
            System.out.println("Прочитанные числа: " + numbers);
            double avg = numbers.stream().mapToInt(Integer::intValue).average().orElse(0.0);
            System.out.println("Среднее значение: " + avg);
        } else {
            System.out.println("Файл пуст или не содержит чисел.");
        }
    }
}
