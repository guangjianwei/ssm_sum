package day12;

import java.util.function.Consumer;

//消费数据
public class DemoConsumer {
    public static void main(String[] args) {
           String str = "！屎吃宝小";
           initConsum(str,
                   (s)->{
                   String s1 = new StringBuilder(s).reverse().toString();
                       System.out.println(s1);
                   });
    }
    public static void initConsum(String str,Consumer<String> consrmer){
           consrmer.accept(str);
    }
}
