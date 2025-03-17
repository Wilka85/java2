package task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку четной длины: ");
        String input = scanner.nextLine();
        if (input.length()%2==0){
            String middle = CalcMiddle(input);
            System.out.println("Два средних знака: "+middle);
        } else {
            System.out.println("Длина строки должна быть четной.");
        }
        scanner.close();
    }
    public static String CalcMiddle(String str){
        int middleIndex = str.length()/2;
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(middleIndex-1));
        sb.append(str.charAt(middleIndex));
        return sb.toString();
    }
}
