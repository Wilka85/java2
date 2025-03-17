package task4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new FixedWorkers("MAlice", 2000));
        employees.add(new FixedWorkers("Bob", 2000));
        employees.add(new HoursWorkers("Charlie", 15));
        employees.add(new HoursWorkers("David", 20));
        employees.add(new FixedWorkers("Eve", 3000));
        employees.add(new HoursWorkers("Frank", 12));
        EmployeeUtils.sortEmployees(employees);
        EmployeeUtils.printEmployees(employees);
        EmployeeUtils.printFirstFive(employees);
        EmployeeUtils.printLastThreeIds(employees);
    }
}
