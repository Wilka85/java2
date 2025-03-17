

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Set;

public class TopicsLoader {
    public static void printTopics(Locale locale) {
        ResourceBundle bundle = ResourceBundle.getBundle("task1", locale);

        Set<String> keys = bundle.keySet();
        for (String key : keys) {
            System.out.println(bundle.getString(key));
        }
    }

    public static void main(String[] args) {
        System.out.println("Темы на английском:");
        printTopics(new Locale("en", "EN"));

        System.out.println("\nТемы на русском:");
        printTopics(new Locale("ru", "RU"));
    }
}
