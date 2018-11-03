package final用法.demo03;

public class demo extends demoFu implements demo01,demo02 {
    @Override
    public void demo01Mathod(){
        System.out.println("demo01Mathod方法");
    }
    @Override
    public void demo02Mathod(){
        System.out.println("demo02Mathod方法");
    }
    @Override
    public void defaultMathod(){
        System.out.println("接口里面的default01Mathod");
        super.defaultMathod();
    }
}
