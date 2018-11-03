package day01.demo04;
/*
java.lang.System类 定义了与系统相关的功能
    静态的
 主要的功能
   public static long currentTimeMillis()：返回以毫秒为单位的当前时间。
   public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)：将数组中指定的数据拷贝到另一个数组中。

 */
public class dateCurrenTime {
    public static void main(String[] args) {
        long timeL = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            System.out.println("aaaa！");
        }
        long timeR = System.currentTimeMillis();
        System.out.println(timeR-timeL);
    }
}
