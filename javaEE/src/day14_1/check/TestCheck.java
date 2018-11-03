package day14_1.check;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.lang.reflect.Method;

public class TestCheck {
    public static void main(String[] args) throws Exception {
        //生成Calculator对象
        Calculator cal = new Calculator();
        int number=0;//定义一个数字用来bug的出现的次数
        //1.获取字节码文件的对象
        Class cla = Class.forName("day14_1.check.Calculator");
        //2.获取所有方法对象
        Method[] methods = cla.getMethods();
        //创建高效字符输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("src\\day14_1\\check\\bug.txt"));
        for (Method method : methods) {
            if (method.isAnnotationPresent(Check.class)) {
                try {
                    method.invoke(cal);
                } catch (Exception e) {
                    number++;
                    //记录日志
                    bw.write(method.getName() + " 方法出现异常了");
                    bw.newLine();
                    bw.write("异常的名称:" + e.getCause().getClass().getSimpleName());//真实原因对象
                    bw.newLine();
                    bw.write("异常的原因:" + e.getCause().getMessage());
                    bw.newLine();
                    bw.write("------------------------");
                }
            }
        }
        bw.write("一共出现了: "+number+" 次异常");
        bw.flush();
        bw.close();
    }
}
