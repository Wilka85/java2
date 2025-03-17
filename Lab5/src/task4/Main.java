package task4;



public class Main {
    public static void main(String[] args) {
        String input = "ааа ббб ёёё ззз ййй ААА БББ ЁЁЁ ЗЗЗ ЙЙЙ";
        String[] words = input.split(" ");
        System.out.println("Слова, содержащие только кириллические буквы:");
        for (String word : words){
            if(isCyrillic(word)){
                System.out.println(word);
            }
        }
    }
    private static boolean isCyrillic(String word){
        for(char ch : word.toCharArray()){
            if (!((ch >= 'а' && ch <= 'я') || (ch >= 'А' && ch <= 'Я') || ch == 'ё' || ch == 'Ё')){
                return false;
            }
        }
        return true;
    }
}