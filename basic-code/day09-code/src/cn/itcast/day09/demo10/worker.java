package cn.itcast.day09.demo10;

public class worker {
    private String name;
    private int workNum;
    private int salary;
    private int bonus;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkNum() {
        return workNum;
    }

    public void setWorkNum(int workNum) {
        this.workNum = workNum;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public worker(String name, int workNum, int salary, int bonus) {

        this.name = name;
        this.workNum = workNum;
        this.salary = salary;
        this.bonus = bonus;
    }

    public worker() {

    }

    public void work(){}
}
