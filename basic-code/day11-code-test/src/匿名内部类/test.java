package 匿名内部类;
//如果接口实现类只需要用唯一的一次，那么就可以使用如下的方法
// 要注意实现类里面要覆盖重写接口所有的抽象方法。
public class test {
    public static void main(String[] args) {
        Ainterface a = new Ainterface() {
            @Override
            public void demo() {
                System.out.println("匿名内部类");
            }
        };
        a.demo();
    }

}
