package task5_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String input = "ааа ббб ёёё ззз ййй ААА БББ ЁЁЁ ЗЗЗ ЙЙЙ";


        Pattern pattern = Pattern.compile("[а-яА-ЯёЁ]+");
        Matcher matcher = pattern.matcher(input);

        System.out.println("Слова, содержащие только кириллические буквы:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}