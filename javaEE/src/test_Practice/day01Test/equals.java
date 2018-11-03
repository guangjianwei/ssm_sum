package test_Practice.day01Test;

public class equals {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = "abc";
        System.out.println(s1 == s2);  //false
        System.out.println(s1.equals(s2));//true
        System.out.println("==============");
        String s3 = "abc";
        String s4 = "abc";
        System.out.println(s3 == s4); //true
        System.out.println(s3.equals(s4));//true
        System.out.println("==============");
        String s5 = "a" + "b" + "c";
        String s6 = "abc";
        System.out.println(s5 == s6);//true
        System.out.println(s5.equals(s6));//true
        System.out.println("===============");
        String s7 = "ab";
        String s8 = "abc";
        String s9 = s7 + "c";//这就相当于new了一个新的String对象
        System.out.println(s9 == s8);//false
        System.out.println(s9.equals(s8));//true

    }
}
