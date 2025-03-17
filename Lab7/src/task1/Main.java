package task1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String,Pet> petMap = new HashMap<>();
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Добавьте животных");
            for(int i = 0;i<3;i++)
            {
                System.out.println("Введите тип животного (Cat/Dog/Parrot): ");
                String type = scanner.nextLine().trim();
                System.out.println("Введите имя животного: ");
                String name=scanner.nextLine().trim();
                Pet pet;
                switch (type.toLowerCase()){
                    case "cat":
                        pet = new Cat(name);
                        break;
                    case "dog":
                        pet=new Dog(name);
                        break;
                    case "parrot":
                        pet=new Parrot(name);
                        break;
                    default:
                        System.err.println("Неверный тип животного. Попробуйте снова.");
                        i--;
                        continue;
                }
                petMap.put(name,pet);
            }
            PetUtils.printPetNames(petMap);
        } catch (IllegalArgumentException e){
            System.err.println("Ошибка: "+e.getMessage());
        } catch (Exception e){
            System.err.println("Непредвиденная ошибка: "+e.getMessage());
        }
    }
}
