package cn.itcast.day06.demo01.demo02;

public class Coder {
    private String name;
    private int id;
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Coder(String name, int id, int salary) {

        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public Coder() {

    }

    public static void work() {
        System.out.println("程序员开始工作了！");
    }
}
