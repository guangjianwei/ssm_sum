package day01.demo04;

import java.util.Arrays;

/*
System中的数组复制方法
  public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)

          src    : 源数组
          srcPos : 源数组被复制的起始索引
          dest   : 目标数组
          destPos: 目标数组需要复制到的起始索引
          length : 复制元素的个数
 */
public class arrayCopy {
    public static void main(String[] args) {
        int[] src ={1,2,3,4,5};
        int[] dest={6,7,8,9};
        System.arraycopy(src,0,dest,0,3);
        System.out.println(Arrays.toString(dest));
    }
}
