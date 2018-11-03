package 测试;

public class Num1 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        int mark = 3;
        switch (mark) {
            case 0:
                getSum(num1, num2);
                break;
            case 1:
                getDifference(num1, num2);
                break;
            case 2:
                getProduct(num1, num2);
                break;
            case 3:
                getQuotient(num1, num2);
                break;
            case 4:
                getRemainder(num1, num2);
                break;
        }
        if (mark > 4) {
            System.out.println("没有这种计算方式！");
        }
    }
    public static void getSum(int a, int b) {
        int c = a+b;
        System.out.println(a +"+" +b+"="+c);
    }
    public static void getDifference(int a, int b) {
        int c = a-b;
        System.out.println(a +"-" +b+"="+c);
    }
    public static void getProduct(int a, int b) {
        int c = a/b;
        System.out.println(a +"/" +b+"="+c);
    }
    public static void getQuotient(int a, int b) {
        int c = a%b;
        System.out.println(a +"%" +b+"="+c);
    }
    public static void getRemainder(int a, int b) {
        int c = a*b;
        System.out.println(a +"*" +b+"="+c);
    }
}
