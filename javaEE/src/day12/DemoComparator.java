package day12;

import java.util.Arrays;
import java.util.Comparator;

//compatator函数式接口作为方法的返回值
public class DemoComparator {
    public static void main(String[] args) {
        String[] arr ={"dfs","rrrrr","a","rwerwrwere"};
        System.out.println("排序前："+Arrays.toString(arr));
//        Arrays.sort(arr, new java.util.DemoComparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.length()-o1.length();
//            }
//        });
        Arrays.sort(arr,newComparator());
        System.out.println("排序后："+Arrays.toString(arr));

    }
    private static Comparator<String> newComparator(){
        return (o1,o2)-> o2.length()-o1.length();
    }
}
