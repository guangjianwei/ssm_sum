package final用法.demo03;

public interface privateInterface {
    public default void defaultMethod1(){
        System.out.println("默认方法1");
        privateDefalut();
    }
    public default void defaultMethod2(){
        System.out.println("默认方法2");
        privateDefalut();
    }
    private void privateDefalut(){
        System.out.println("a");
        System.out.println("a");
        System.out.println("a");
    }
}
