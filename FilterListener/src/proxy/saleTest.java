package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class saleTest {
    public static void main(String[] args) {
        lenvo sale = new lenvo();
        //动态代理增强lenovo对象
        /*
            三个参数：
                1. 类加载器：真实对象.getClass().getClassLoader()
                2. 接口数组：真实对象.getClass().getInterfaces()
                3. 处理器：new InvocationHandler()
                */
        SaleComputer proxy_sale = (SaleComputer) Proxy.newProxyInstance(sale.getClass().getClassLoader(), sale.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                System.out.println("该方法执行了");
//                System.out.println(method.getName());
//                System.out.println(args[0]);
//                return null;
                //接下来我们对方法进行增强
                if(method.getName().contains("sale")){
                    //1.增强参数
                    double money  = (double)(args[0]);
                    money = money*0.85;
                    //用真实的对象来调用方法
                    System.out.println("专车接你...");
                    String invoke = (String)method.invoke(sale, money);
                    String invoke_zeng = invoke+"+免费赠送鼠标垫";
                    System.out.println(invoke_zeng);
                    System.out.println("免费送你...");
                    return invoke_zeng;
                }else{
                    //正常执行
                    Object invoke = method.invoke(sale, args);
                    return invoke;
                }
                }
        });
        proxy_sale.saleComputer(8000.0);
    }
}
