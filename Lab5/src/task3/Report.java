package task3;

public class Report {
    public static void generateReport(Employee[] employees){
        System.out.printf("%-15s %10s%n","FullName","Salary");
        System.out.println("--------------------");
        for (Employee employee:employees){
            System.out.printf("%-15s %10.2f%n",employee.getFullName(),employee.getSalary());
        }
    }
}
