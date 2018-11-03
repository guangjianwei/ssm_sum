package num07;

import java.util.ArrayList;
import java.util.List;

/*
将如下数据存入list集合中，"itcast","cn","hei","Python","Java",并完成以下要求：
遍历集合，将集合中长度小于4的元素替换成*
打印替换后的结果
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("itcast","cn","hei","Python","Java"));
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).length()<4){
                list.set(i,"*");
            }
        }
        System.out.println(list);
    }
}
