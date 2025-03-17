package task5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NumberReader {
    private static final String FILE_NAME="f.txt";
    public static void countPositive(){
        int count=0;
        try(BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))){
            String line;
            while ((line=reader.readLine())!=null){
                int number = Integer.parseInt(line);
                if(number>0){
                    count++;
                }
            }
        } catch (IOException e){
            System.out.println("Ошибка чтения");
            throw new RuntimeException(e);
        }
        System.out.println("Количество положительных: "+count);
    }
}
