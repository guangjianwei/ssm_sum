package day02.demo02;

public class test {
    public static void main(String[] args) {
        demoImpl demoImpl = new demoImpl(true,"无敌",22);
        System.out.println(demoImpl.mvp1);
        System.out.println(demoImpl.mvp);
        demoImpl.get(3);
    }

}
