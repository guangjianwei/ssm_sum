package day02.demo03;

public class Test {
    public static void main(String[] args) {
        CollectionArrayList<String> cllArray =new CollectionArrayList("傻逼宝");
        String name = cllArray.get();
        System.out.println(name);
        System.out.println("========泛型方法的使用========");
        getT("RER");
        getT(true);
        getT('d');
    }
    public  static <T> void getT(T t){
        System.out.println(t.getClass());
    }
}
