package task4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TemperatureReader {
    private static final String FILE_NAME="temperatures.txt";
    public static void readAndCalculateAverage(){
        int count=0;
        double sum =0;
        try(BufferedReader reader=new BufferedReader(new FileReader(FILE_NAME))){
            String line;
            while ((line= reader.readLine())!=null){
                double temperature = Double.parseDouble(line);
                sum+=temperature;
                count++;
            }
        } catch (IOException e){
            System.out.println("Ошибка чтения");
            throw new RuntimeException(e);
        }
        if(count>0){
            double avg = sum/count;
            System.out.printf("Средняя температура: %.2f\n",avg);
        } else {
            System.out.println("Файл содержит не числа или пустой");
        }
    }
}
