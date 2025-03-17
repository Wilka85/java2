package task5;

public class Main {
    public static void main(String[] args) {
        String input ="Если есть хвосты по дз, начните с 1 несданного задания. 123 324 111 4554";
        String[] words = input.split(" ");
        System.out.println("Палиндромы среди числовых слов:");
        for (String word:words){
            if(word.matches("\\d+")){
                if(isPalindrom(word)){
                    System.out.println(word);
                }
            }
        }
    }
    private static boolean isPalindrom(String str){
        StringBuilder sb = new StringBuilder(str);
        return sb.toString().equals(sb.reverse().toString());
    }
}
