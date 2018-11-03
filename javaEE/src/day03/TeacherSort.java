package day03;

import java.util.Objects;

public class TeacherSort implements Comparable{
    private String name;
    private int age;

    public TeacherSort() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public TeacherSort(String name, int age) {

        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "StudentSort{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeacherSort that = (TeacherSort) o;
        return age == that.age &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Object o) {
        TeacherSort ts = (TeacherSort)o;
        return ts.age-this.age;
    }
}
