package test_Practice.day13Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

/*
练习二：Function接口使用
1.使用lambda表达式分别将以下功能封装到Function对象中
a)求Integer类型ArrayList中所有元素的平均数
b)将Map<String,Integer>中value存到ArrayList<Integer>中
2.已知学生成绩如下
姓名	成绩
岑小村	59
谷天洛	82
渣渣辉	98
蓝小月	65
皮几万	70
3.以学生姓名为key成绩为value创建集合并存储数据，使用刚刚创建的Function对象求学生的平均成绩
 */
public class test2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        map.put("岑小村", 59);
        map.put("谷天洛", 82);
        map.put("渣渣辉", 98);
        map.put("蓝小月", 65);
        map.put("皮几万", 70);
        getAvg(map, list, (s) -> {
            int sum = 0;
            int count = 0;
            for (Object o : s) {
                Integer i = (Integer) o;
                sum += i;
                count++;
            }
            return sum / count;
        });
    }

    public static void getAvg(Map<String, Integer> map, ArrayList<Integer> list, Function<ArrayList, Integer> function) {
        Set<String> keySet = map.keySet();
        for (String s : keySet) {
            list.add(map.get(s));
        }
        Integer apply = function.apply(list);
        System.out.println("平均数为" + apply);
    }
}
