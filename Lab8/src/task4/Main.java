package task4;

public class Main {
    public static void main(String[] args) {
        try {
            TemperatureWriter.writeTemperatures();
            TemperatureReader.readAndCalculateAverage();
        } catch (Exception e) {
            System.out.println("err");
            e.printStackTrace();
        }
    }
}
