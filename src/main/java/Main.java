import model.Student;
import repo.StudentDB;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        // ArrayList
//        Student student1 = new Student("Harry", "123", "Physic");
//        Student student2 = new Student("Manuel", "235", "Mathematic");
//
//        ArrayList<Student> students = new ArrayList<>();
//        students.add(student1);
//        students.add(student2);
//
//        StudentDB studentDB = new StudentDB();
//        studentDB.setStudents(students);
//        studentDB.addStudents(new Student("Pascal", "235", "Computer Science"));
//
//        System.out.println(studentDB);
//
////        studentDB.removeStudents(student2);
//        System.out.println(studentDB);

        // HashMap
        HashMap<String, Student> students = new HashMap<>();
        students.put("123", new Student("Harry", "123", "Physic"));
        students.put("235", new Student("Manuel", "235", "Mathematic"));

        StudentDB studentDB = new StudentDB();
        studentDB.setStudents(students);
        System.out.println(studentDB);
        studentDB.addStudents(new Student("Pascal", "283", "Computer Science"));
        System.out.println(studentDB);

        studentDB.removeStudents(students.get("123"));
        System.out.println(studentDB);

        System.out.println(studentDB.findById("2"));


    }
}
