package task1;

public class Parrot extends Pet{
    public Parrot(String name){
        super(name);
    }
    @Override
    public String getSound(){
        return "piii";
    }
}
