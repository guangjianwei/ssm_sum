package final用法.demo03;

public interface privateInterface1 {
    public static void defaultMethod1(){
        System.out.println("静态方法1");
        privateDefalut();
    }
    public static void defaultMethod2(){
        System.out.println("静态方法2");
        privateDefalut();
    }
   private static void privateDefalut(){
        System.out.println("staticA");
        System.out.println("staticB");
        System.out.println("staticC");
    }
}
