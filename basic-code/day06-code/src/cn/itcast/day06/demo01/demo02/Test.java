package cn.itcast.day06.demo01.demo02;

public class Test {
    public static void main(String[] args) {
        Manage man = new Manage("笑傲江湖",30,1000,6000);
        Coder cod = new Coder("遗臭万年",001,1000);
        System.out.println("姓名为"+man.getName()+"工资为"+man.getSalary());
    }
}
