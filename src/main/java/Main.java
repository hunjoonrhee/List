import model.Student;
import repo.StudentDB;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("Harry", "123", "Physic");
        Student student2 = new Student("Manuel", "235", "Mathematic");

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);

        StudentDB studentDB = new StudentDB();
        studentDB.setStudents(students);
        studentDB.addStudents(new Student("Pascal", "235", "Computer Science"));

        System.out.println(studentDB);

        studentDB.removeStudents(student2);
        System.out.println(studentDB);
    }
}
