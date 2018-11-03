package day07;

import java.util.Calendar;

public class TestCocul {
    public static void main(String[] args) {
      sumCou(20,30,( a, b)-> a+b
      );
    }
    public static void sumCou(int a ,int b, Caculator cacl){
        int sum = cacl.sum(a,b);
        System.out.println(sum);

    }
}
