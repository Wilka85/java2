package task2;

public class PremiyaException extends Exception{
    public PremiyaException(double bonus){
        super("Премия не может быть отрицательной: "+bonus);
    }
}
