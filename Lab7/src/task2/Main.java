package task2;

public class Main {
    public static void main(String[] args) {
        try {
            Employee staff = new StaffEmployee("FGHH","HJNGTY",50000,1000);
            System.out.println("Зарплата штатного сотрудника: "+staff.calculateSalary());
        } catch (OkladException e){
            System.err.println(e.getMessage());
        }
        try {
            Employee contractor = new ContractEmployee("Петр Петров", "Разработчик", -45000);
            System.out.println("Зарплата сотрудника по контракту: " + contractor.calculateSalary());
        } catch (OkladException e) {
            System.err.println(e.getMessage());
        }
        try {
            Employee validEmployee = new StaffEmployee("Анна Смирнова", "Аналитик", 60000, 5000);
            System.out.println("Зарплата штатного сотрудника: " + validEmployee.calculateSalary());
        } catch (OkladException e) {
            System.err.println(e.getMessage());
        }
    }
}
