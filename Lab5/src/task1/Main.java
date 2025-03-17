package task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String input = scanner.nextLine();
        int start_ind = input.indexOf("Java");
        if (start_ind != -1){
            String res = input.substring(start_ind,start_ind+4);
            System.out.println("Результат: " + res);
        } else {
            System.out.println("Слово 'Java' не найдено");
        }
        scanner.close();
    }
}
