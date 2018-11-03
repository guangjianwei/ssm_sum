package cn.itcast.day09.demo11;

public abstract class Animals {
    int age;
    String color;
    public abstract void eat(String something);

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Animals(int age, String color) {

        this.age = age;
        this.color = color;
    }

    public Animals() {

    }
}
