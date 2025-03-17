package task2;

public class Student {
    private String name;
    private int age;
    private String spec;
    private int course;

    public Student(String name, int age, String spec, int course)
    {
        this.name=name;
        this.age=age;
        this.spec=spec;
        this.course=course;
    }
    public void changeCourse()
    {
        if (course < 4)
        {
            course++;
        }
        else
        {
            System.out.println(name + "уже на последнем курсе.");
        }
    }
    public void changeSpec(String newSpec)
    {
        this.spec = newSpec;
        System.out.println(name + " теперь на курсе: "+ newSpec);
        this.course=1;
    }
    public void info()
    {
        System.out.println("Имя: "+ name);
        System.out.println("Возраст: "+ age);
        System.out.println("Курс: " + course);
        System.out.println("Специальность: "+spec);
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSpec() {
        return spec;
    }

    public int getCourse() {
        return course;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public void setCourse(int course) {
        this.course = course;
    }
}
