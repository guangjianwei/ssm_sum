package day04;

import java.util.Objects;

public class Student {
    private String name;
    private String dress;

    public Student() {
    }

    public Student(String name, String dress) {
        this.name = name;
        this.dress = dress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDress() {
        return dress;
    }

    public void setDress(String dress) {
        this.dress = dress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", dress='" + dress + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) &&
                Objects.equals(dress, student.dress);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, dress);
    }
}
