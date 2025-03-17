package task3;

public class Main {
    public static void main(String[] args) {
        Employee[] employees ={
                new Employee("Alex Ustimenko",2050.778),
                new Employee("Bob Bobbov",150.333),
                new Employee("Rudolf Rudolwski",777.774)
        };
        Report.generateReport(employees);
    }
}
