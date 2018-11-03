package final用法.demo03;

public abstract interface demo01 {
    public abstract void demo01Mathod();
    public default void defaultMathod(){
        System.out.println("接口里面default01Mathod");
    };
}
