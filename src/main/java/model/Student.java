package model;

import java.util.Objects;

public class Student {

    private String name;
    private String id;
    private String curse;

    public Student(String name, String id, String curse) {
        this.name = name;
        this.id = id;
        this.curse = curse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCurse() {
        return curse;
    }

    public void setCurse(String curse) {
        this.curse = curse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (!Objects.equals(name, student.name)) return false;
        if (!Objects.equals(id, student.id)) return false;
        return Objects.equals(curse, student.curse);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (curse != null ? curse.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", curse='" + curse + '\'' +
                '}';
    }
}
