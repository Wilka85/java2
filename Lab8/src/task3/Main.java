package task3;



public class Main {
    public static void main(String[] args) {
        try {
            FileGenerator.generateRandomFilesToFile(20,1,20);
            FileSplitter.splitFiles();
        } catch (Exception e) {
            System.out.println("err");
            e.printStackTrace();
        }
    }
}
