package task5;

public class Main {
    public static void main(String[] args) {
        try {
            NumberWriter.writeNumbers();
            NumberReader.countPositive();
        } catch (Exception e){
            System.out.println("err");
            e.printStackTrace();
        }
    }
}
