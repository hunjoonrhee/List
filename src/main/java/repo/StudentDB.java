package repo;

import model.Student;

import java.util.ArrayList;
import java.util.HashMap;

public class StudentDB {

    private HashMap<String, Student> students;

    public StudentDB(){

    }

    public StudentDB(HashMap<String, Student> students) {
        this.students = students;
    }

    public void addStudents(Student student){
        students.put(student.getId(), student);
    }

    public void removeStudents(Student student){
        students.remove(student.getId());
    }

    public HashMap<String, Student> getStudents() {
        return students;
    }

    public void setStudents(HashMap<String, Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "students=" + students +
                '}';
    }
}
