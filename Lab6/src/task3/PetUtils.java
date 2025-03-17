package task3;

import java.util.Map;

public class PetUtils {
    public static void printPetNames(Map<String,Pet> pets){
        System.out.println("Names:");
        for (String name:pets.keySet()){
            System.out.println(name);
        }
    }
}
