package test_Practice.day01Test;

public class test9 {
    public static void main(String[] args) {
//        long start = System.currentTimeMillis();
//        testString();
//        long end = System.currentTimeMillis();
//        System.out.println("String所花费的时间为:"+(end-start));
        long start = System.currentTimeMillis();
        testStringBuilder();
        long end = System.currentTimeMillis();
        System.out.println("StringBuilde所花费的时间为:"+(end-start));
    }

    public static void  testString(){
        String str = "hello";
        for(int i = 0; i<100000;i++){
            str += "world";
        }
    }
    public static void testStringBuilder(){
        StringBuilder sb = new StringBuilder("hello");
        for(int i = 0; i<100000;i++){
            sb.append("world");
        }
        String newStr = sb.toString();
    }
}
