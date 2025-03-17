package task1;

import java.util.HashMap;
import java.util.Map;

public class ToyUtils {
    public static void printEntrySet(HashMap<String,Product> toyMap){
        System.out.println("EntrySet (Пары значений):");
        for (Map.Entry<String,Product> entry: toyMap.entrySet()){
            System.out.println(entry.getKey()+  " -> "+entry.getValue());
        }
    }
    public static void printKeySet(HashMap<String,Product> toyMap){
        System.out.println("\nKeySet (Имена продуктов):");
        for (String key:toyMap.keySet()){
            System.out.println(key);
        }
    }
    public static void printValues(HashMap<String,Product> toyMap){
        System.out.println("\nValues (Объекты продуктов):");
        for (Product value:toyMap.values()){
            System.out.println(value);
        }
    }
}
