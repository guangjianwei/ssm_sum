package test_Practice.day07Test;
/*

 */
public class test10 {
    public static void main(String[] args) {
// 2.在此使用Lambda【省略格式】调用invokeCalc方法来计算130-120的结果ß
        invokeCalc(130, 120, (a, b) -> a - b);
    }

    private static void invokeCalc(int a, int b, Calculator calculator) {
        int result = calculator.calc(a, b);
        System.out.println("结果是：" + result);
    }
}
