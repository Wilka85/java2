package task2;

public class Employee {
    private String fullName;
    private String position;
    private double salary;
    public Employee(String fullName,String position,double salary) throws OkladException{
        if(salary<0){
            throw new OkladException(salary);
        }
        this.fullName=fullName;
        this.position=position;
        this.salary=salary;
    }
    public String getFullName(){
        return fullName;
    }
    public void setFullName(String fullName){
        this.fullName=fullName;
    }
    public String getPosition(){
        return position;
    }
    public void setPosition(String position){
        this.position=position;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary) throws OkladException{
        if(salary<0){
            throw new OkladException(salary);
        }
        this.salary=salary;
    }
    public double calculateSalary(){
        try {
            return salary;
        } catch (Exception e){
            System.err.println("Ошибка при расчете зарплаты: "+e.getMessage());
            return 0;
        }
    }
}
