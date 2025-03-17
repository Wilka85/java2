package task2;

public class ContractEmployee extends Employee{
    public ContractEmployee(String fullName,String position,double salary) throws OkladException{
        super(fullName,position,salary);
    }
    @Override
    public double calculateSalary(){
        try {
            return getSalary();
        } catch (Exception e){
            System.err.println("Ошибка при расчете зарплаты: "+e.getMessage());
            return 0;
        }
    }
}
