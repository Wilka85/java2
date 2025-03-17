package task1;

public abstract class Pet {
    private String name;

    public Pet(String name){
        if(name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Имя не может быть пустым или null");
        }
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public abstract String getSound();

    @Override
    public String toString(){
        return getClass().getSimpleName()+"{name='"+name+"'}";
    }
}
