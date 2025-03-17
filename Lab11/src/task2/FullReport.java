package task2;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Random;
public class FullReport {
    public static void generateReport(Employee[] employees, Locale locale) {

        ResourceBundle bundle = ResourceBundle.getBundle("messages", locale);
        String fullNameHeader = bundle.getString("report.header.fullname");
        String salaryHeader = bundle.getString("report.header.salary");


        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);


        Random random = new Random();


        System.out.printf("%-20s %15s%n", fullNameHeader, salaryHeader);
        System.out.println("--------------------------------------");


        for (Employee employee : employees) {
            double coefficient = 1.1 + (random.nextDouble() * 0.4);
            double newSalary = employee.getSalary() * coefficient;
            String formattedSalary = currencyFormat.format(newSalary);
            System.out.printf("%-20s %15s (Коэф: %.2f)%n", employee.getFullName(), formattedSalary, coefficient);
        }
    }

    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("John Doe", 5000.00),
                new Employee("Анна Иванова", 75000.00),
                new Employee("Mike Smith", 3200.00),
                new Employee("Екатерина Петрова", 89000.00)
        };

        System.out.println("Отчет на английском:");
        generateReport(employees, new Locale("en", "US"));

        System.out.println("\nОтчет на русском:");
        generateReport(employees, new Locale("ru", "RU"));
    }
}
