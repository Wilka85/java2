package task2;

public class Main
{
    public static void main(String[] args) {
        Student A = new Student("Alex",101,"Тестировщик",1);
        A.info();
        A.changeCourse();
        A.info();
        A.changeSpec("Экономист");
        A.info();
    }
}
