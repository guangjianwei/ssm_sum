package final用法.demo02;

public class test {
    public static void main(String[] args) {
        MyInterfaceImpl impl= new MyInterfaceImpl();
        //错误写法
        // impl.method();
        //静态方法直接用接口名称进行使用
        MyInterface.mathod();
    }

}
