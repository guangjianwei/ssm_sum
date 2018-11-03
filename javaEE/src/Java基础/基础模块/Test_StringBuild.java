package Java基础.基础模块;

/*
* StringBuilder是可变的字符序列，又称为字符串缓冲区.
    StringBuilder append(…)	  添加任意类型数据的字符串形式
    并返回StringBuilder对象本身
    String toString() 		  转换 StringBuilder  --->  String
    Tips: String ---> StringBuilder 可以使用append（）方法  或  StringBuilder带参构造
    StringBuilder reverse(…)	  添加StringBuilder内容反转
    并返回StringBuilder对象本身
* */
public class Test_StringBuild {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("I");
        stringBuilder.append(" Love");
        stringBuilder.append(" Java");
        System.out.println(stringBuilder.toString());

        System.out.println(stringBuilder.reverse().toString());
    }
}
