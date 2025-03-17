package task2;

public class OkladException extends Exception{
    public OkladException(double salary){
        super("Невозможно создать сотрудника - указан отрицательный оклад: "+salary);
    }
}
