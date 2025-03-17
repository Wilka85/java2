package task2;

public class Main {
    public static void main(String[] args) {
        try {
            FileHandler.writeNumbers();
            FileHandler.readNumbers();
        } catch (Exception e) {
            System.out.println("Произошла ошибка.");
            e.printStackTrace();
        }
    }
}
