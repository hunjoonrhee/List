package repo;

import model.Student;

import javax.management.AttributeNotFoundException;
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
        if(students.get(student.getId()).getName() == ""){
            throw new IllegalArgumentException("Student name is not filled in!");
        }
    }

    public void removeStudents(Student student){
        students.remove(student.getId());
    }

    public HashMap<String, Student> getStudents() {
        return students;
    }

    public Student findById(String id){
        if(!students.containsKey(id)){
            throw new IllegalArgumentException("Invalid id!");
        }
//        Student student;
//        try{
//            student = students.get(id);
//        }catch (Exception e){
//            throw new NullPointerException("Invalid id!");
//        }

        return students.get(id);
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
