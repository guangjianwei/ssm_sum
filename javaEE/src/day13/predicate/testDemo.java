package day13.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class testDemo {
    public static void main(String[] args) {
       String[] strArr ={"古力娜扎,女","迪丽热巴,女","郑爽,女","胡彦斌,男"};
        ArrayList<String> list = getOpinon(strArr, s -> s.contains("女"), s -> s.split(",")[0].length() > 3);
        System.out.println(list);
    }

    private static ArrayList<String> getOpinon(String[] strArr, Predicate<String> one, Predicate<String> two) {
        ArrayList<String> list = new ArrayList<>();
        for (String s : strArr) {
            boolean flag = one.and(two).test(s);
            if(flag){
               list.add(s);
            }

        }
         return list;
    }
}
