package task2;

public class StaffEmployee extends Employee{
    private double bonus;
    public StaffEmployee(String fullName,String position,double salary,double bonus) throws OkladException{
        super(fullName,position,salary);
        setBonus(bonus);
    }
    public double getBonus(){
        return bonus;
    }
    public void setBonus(double bonus){


        try {
            if (bonus<0){
                throw new PremiyaException(bonus);
            }

        } catch (PremiyaException e){
            System.err.println(e.getMessage());

        }
        this.bonus=bonus;
    }
    @Override
    public double calculateSalary(){
        try {
            return getSalary() + getBonus();
        } catch (Exception e) {
            System.err.println("Ошибка при расчете зарплаты: " + e.getMessage());
            return 0;
        }
    }

}
