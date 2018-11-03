package cn.itacast.day07.demo01;

public class Person1 {
    public static void main(String[] args) {
        Person[] arrperson = new Person[3];
        Person one = new Person();
        Person two = new Person();
        Person three = new Person();
        one.setName("迪丽热巴");
        two.setName("马儿扎哈");
        three.setName("奥巴马");
        one.setAge(20);
        two.setAge(21);
        three.setAge(22);
        arrperson[0]=one;
        arrperson[1]=two;
        arrperson[2]=three;
        System.out.println(arrperson[0].getName());//arrperson[0]这里面存放的地址


    }
}
