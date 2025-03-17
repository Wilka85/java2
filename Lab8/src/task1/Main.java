package task1;

public class Main {
    public static void main(String[] args) {
        try {
            FileCreator.createFile();
            FilePrintInfo.printInfo();
            FileRead.readFromFile();
        } catch (Exception e){
            System.out.println("Произошла ошибка в программе.");
            e.printStackTrace();
        }
    }
}
