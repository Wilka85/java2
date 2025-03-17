package task1;

public class Cat extends Pet{
    public Cat(String name){
        super(name);
    }
    @Override
    public String getSound(){
        return "miae";
    }
}
