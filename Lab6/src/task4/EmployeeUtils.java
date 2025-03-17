package task4;

import java.util.Comparator;
import java.util.List;

public class EmployeeUtils {
    public static void sortEmployees(List<Employee> employees){
        employees.sort(Comparator
                .comparingDouble(Employee::calculator).reversed()
                .thenComparing(Employee::getName));
    }
    public static void printEmployees(List<Employee> employees){
        System.out.println("Sorted:");
        for (int i=0;i<employees.size();i++){
            Employee employee=employees.get(i);
            System.out.printf("ID: %d, Name: %s, Monthly Salary: %.2f%n",
                    i + 1, employee.getName(), employee.calculator());
        }
    }
    public static void printFirstFive(List<Employee> employees){
        System.out.println("\nFirst 5");
        employees.stream()
                .limit(5)
                .forEach(employee -> System.out.println(employee.getName()));
    }
    public static void printLastThreeIds(List<Employee> employees){
        System.out.println("\nLast 3 IDs:");
        int total = employees.size();
        employees.stream()
                .skip(total-3)
                .forEach(employee -> System.out.println("ID: " + (employees.indexOf(employee) + 1)));
    }
}
