package 接口作参数;

import java.util.ArrayList;
import java.util.List;

public class mian {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();//List为ArrayList的接口，这是多态的用法
        List<String> list=addList(arr);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    public static List<String> addList(List<String> arr){
        arr.add("傻屌宝");
        arr.add("傻屌求");
        arr.add("帅见见");
        return  arr;
    }
}
