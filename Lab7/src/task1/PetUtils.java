package task1;

import java.util.Map;

public class PetUtils {
    public static void printPetNames(Map<String,Pet> pets){
        if(pets == null || pets.isEmpty()){
            throw new IllegalArgumentException("Список животных пуст или null");
        }
        System.out.println("Names:");
        for(Map.Entry<String,Pet> entry:pets.entrySet()){
            try {
                System.out.println(entry.getKey()+": "+entry.getValue().getName());
            } catch (NullPointerException e){
                System.err.println("Ошибка: Животное с ключом '"+entry.getKey()+"' имеет null-значение");
            }

        }
    }
}
