package day12;

public class DemoLanmbdaSum {
    public static void main(String[] args) {
        showSum((int a,int b)->{
            System.out.println(a+b);
        },4,5);
    }
//使用LanmbdaSum函数式接口作为方法的参数
    private static void showSum(LanmbdaSum lanmbdaSum,int x,int y){
        lanmbdaSum.sum(x,y);

    }
}
