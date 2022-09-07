package repo;

import model.Student;

import java.util.ArrayList;

public class StudentDB {

    private ArrayList<Student> students;

    public StudentDB(){

    }

    public StudentDB(ArrayList<Student> students) {
        this.students = students;
    }

    public void addStudents(Student student){
        students.add(student);
    }

    public void removeStudents(Student student){
        students.remove(student);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "students=" + students +
                '}';
    }
}
