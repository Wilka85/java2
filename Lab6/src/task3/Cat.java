package task3;

public class Cat extends Pet{
    public Cat(String name){
        super(name);
    }
    @Override
    public String getSound(){
        return "miae";
    }
}
