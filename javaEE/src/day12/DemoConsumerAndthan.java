package day12;

import java.util.function.Consumer;

//Consumer的默认方法andThen
public class DemoConsumerAndthan {
    public static void main(String[] args) {
        String[] arr  ={"傻逼宝,男","臭逼宝,女","蠢逼宝,不男不女"};
        printMessage(arr, s-> System.out.println("姓名："+s.split(",")[0]+",性别："+s.split(",")[1]));
    }
    public static void printMessage(String[] arr,Consumer<String> consumer){
        for (String s : arr) {
        consumer.accept(s);
        }

    }
}
