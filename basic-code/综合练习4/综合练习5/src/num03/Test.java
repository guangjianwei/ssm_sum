package num03;

import java.util.ArrayList;
import java.util.List;
/*
1.定义Empl类，包含salary（工资属性私有化），提供空参带参构造方法，和set/get方法
2.定义ArrayList集合，存入3个Empl对象，对象的薪资属性分别为：100，123，567
3.遍历集合,将集合中元素的薪资小于等于300的元素删除，将集合中元素的薪资大于300的元素
，元素值在原来基础上加100，并在控制台打印输出修改后集合中所有元素的属性
 */
public class Test {
    public static void main(String[] args) {
        Empl emplOne =new Empl(100);
        Empl emplTwo =new Empl(123);
        Empl emplThree =new Empl(567);
        ArrayList<Empl> list =new ArrayList<>(List.of(emplOne,emplTwo,emplThree));
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getSalary()<=300){
                list.remove(i);
                i--;//保证被删除的这个元素的下一个元素，在下一次循环的时候能够被检测到
            }else{
                list.get(i).setSalary(list.get(i).getSalary()+100);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getSalary());
        }
    }

}
