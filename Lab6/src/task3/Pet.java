package task3;

public abstract class Pet {
    private String name;
    public Pet(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public abstract String getSound();
    @Override
    public String toString(){
        return getClass().getSimpleName() + "{name='"+name+"'}";
    }
}
