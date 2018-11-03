package day01.demo05;

public class StringparseObject {
    //基本类型之间的转换
    public static void main(String[] args) {
        String a = "1";
        System.out.println(Integer.parseInt(a));
        String c = "true";
        System.out.println(Boolean.parseBoolean(c));
        String d = "4.5";
        System.out.println(Double.parseDouble(d));
    }

}
