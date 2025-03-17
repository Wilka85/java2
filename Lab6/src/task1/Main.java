package task1;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,Product> toyMap = new HashMap<>();
        toyMap.put("Машинка", new Product("Машинка", 59.99));
        toyMap.put("Самолетик", new Product("Самолетик", 24.99));
        toyMap.put("Лодочка", new Product("Лодочка", 19.99));
        ToyUtils.printEntrySet(toyMap);
        ToyUtils.printKeySet(toyMap);
        ToyUtils.printValues(toyMap);
    }
}
