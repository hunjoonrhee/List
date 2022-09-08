package repo;

import model.Student;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {

    @Test
    void whenIdNotFoundInKeyListThenExpectedException() {
        // GIVEN
        HashMap<String, Student> students = new HashMap<>();
        students.put("123", new Student("Harry", "123", "Physic"));
        students.put("235", new Student("Manuel", "235", "Mathematic"));

        StudentDB studentDB = new StudentDB();
        studentDB.setStudents(students);


        // When
        try{
            String id = "1234";
            studentDB.findById(id);
            fail();
        }catch (Exception e){
        }

        // When

//        String id = "1234";
//        assertThrows(IllegalArgumentException.class, ()->studentDB.findById(id));

    }

    @Test
    void whenNameOfStudentIsNotFilledInThenExpectedException() {
        // GIVEN
        HashMap<String, Student> students = new HashMap<>();
        students.put("123", new Student("Harry", "123", "Physic"));
        students.put("235", new Student("Manuel", "235", "Mathematic"));

        StudentDB studentDB = new StudentDB();
        studentDB.setStudents(students);




        // When
        try{
            Student newStudent = new Student("", "22", "Mathematic");
            studentDB.addStudents(newStudent);
            fail();
        }catch (Exception e){
        }

        // When

//        Student newStudent = new Student("", "22", "Mathematic");
//        assertThrows(IllegalArgumentException.class, ()->studentDB.addStudents(newStudent));

    }
}