package day01.demo01;

public class toString {
    public static void main(String[] args) {
        Person per = new Person("香蕉",25);
        Person per1 = new Person("苹果",25);
        Person per2 = new Person("香蕉",25);
        System.out.println(per.toString());
        System.out.println("======================");
        System.out.println(per.equals(per1));
        System.out.println(per.equals(per2));
    }

}
