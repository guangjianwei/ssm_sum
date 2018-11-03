package Java基础.基础模块;


import java.util.Arrays;

/*
*
* 将指定源数组中的数组从指定位置复制到目标数组的指定位置。复制的组件数量等于length参数。
* System.arraycopy(src,srcpos,dest,destpos,length)
src - 源数组。
srcPos - 源数组中的起始位置。
dest - 目标数组。
destPos - 目的地数据中的起始位置。
length - 要复制的数组元素的数量。
* */
public class Test_ArrayCopy {
    public static void main(String[] args) {
        int[] src = new int[]{123,234,345};
        int[] desc = new int[]{567,678,789};
        System.out.println("src : " + Arrays.toString(src) + " desc : " + Arrays.toString(desc));
        System.arraycopy(src,1,desc,1,2);
        System.out.println("src : " + Arrays.toString(src) + " desc : " + Arrays.toString(desc));
    }
}
