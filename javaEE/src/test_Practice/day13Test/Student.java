package test_Practice.day13Test;

public class Student {
    String name;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    public Student(String name) {
        this.name = name;
    }

    public Student() {

    }
}
