package task3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,Pet> petMap=new HashMap<>();
        petMap.put("Aaa",new Cat("kaspi"));
        petMap.put("bbb",new Dog("bol"));
        petMap.put("QWE",new Parrot("ri"));
        PetUtils.printPetNames(petMap);
    }
}
