package task3;

public class Dog extends Pet{
    public Dog(String name){
        super(name);
    }
    @Override
    public String getSound(){
        return "woo";
    }
}
