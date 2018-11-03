package cn.itcast.day08.dmeo01;
/*
3+1种创建字符串对象的方法
 */
public class Demo01String {
    public static void main(String[] args) {
        String str1 = new String();
        System.out.println("第一种方法："+str1);
        char[] charArray ={'x','y','z'};//根据字符串数组来创建字符串
        String str2 = new String(charArray);
        System.out.println("第二种方法："+str2);
        byte[] byteArray ={97,98,99};
        String str3 = new String(byteArray);//根据字节数组来创建字符串
        System.out.println("第三种方法："+str3);
        String str4 = "Hello";
        System.out.println("第四种方法："+str4);
    }
}
