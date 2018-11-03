package test_Practice.day02Test;
/*
十一、编写一个泛型方法，实现任意引用类型数组指定位置元素交换。
 */
public class test11 {
    public static void main(String[] args) {
        Integer[] a = {1,2,3,4,5,6};
        method(a,0,1);
    }
    //编写泛型方法
    public static <E> void method( E[] e,int a,int b){
        //元素互换
        E temp = e[a];
        e[a] = e[b];
        e[b] = temp;
        for (int i = 0; i < e.length; i++) {
            System.out.println(e[i]);
        }
    }
}
