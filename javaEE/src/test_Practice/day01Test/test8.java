package test_Practice.day01Test;

public class test8 {
    public static void main(String[] args) {
        char[] cha ={'i','t','c','a','s','a'};
        //将源数组中第2个元素，复制到目标数组最后1位数组上
        System.arraycopy(cha, 1, cha, 5, 1);
        for (int i = 0; i < cha.length; i++) {
            System.out.print(cha[i]);
        }
    }
}
