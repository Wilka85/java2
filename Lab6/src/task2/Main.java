package task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        Map<String,Integer> grades1=new HashMap<>();
        grades1.put("Math",10);
        grades1.put("C++",10);
        grades1.put("Java",10);
        Map<String,Integer> grades2=new HashMap<>();
        grades2.put("Math",2);
        grades2.put("C++",2);
        grades2.put("Java",2);
        Map<String,Integer> grades3=new HashMap<>();
        grades3.put("Math",7);
        grades3.put("C++",7);
        grades3.put("Java",7);
        students.add(new Student("Alex","xxx",3,grades1));
        students.add(new Student("Bob","YYY",4,grades2));
        students.add(new Student("Lil","AAA",1,grades3));
        StudentUtils.processStudents(students);
        StudentUtils.printStudents(students,4);
    }
}
