package task2;

import java.util.Iterator;
import java.util.List;

public class StudentUtils {
    public static void processStudents(List<Student> students){
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()){
            Student student=iterator.next();
            if(student.getAverage()<3){
                iterator.remove();
            } else {
                student.setCourse(student.getCourse()+1);
            }
        }
    }
    public static void printStudents(List<Student> students, int course){
        System.out.println("Students on course "+course+": ");
        for (Student student:students){
            if(student.getCourse() == course){
                System.out.println(student.getName());
            }
        }
    }
}
