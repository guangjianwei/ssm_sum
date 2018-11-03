package 成员内部类;

public class Test {
    public static void main(String[] args) {
        Body per = new Body();
        per.bodyHeap();
        System.out.println("=============");
        new Body().new Heart().beat();
    }
}
