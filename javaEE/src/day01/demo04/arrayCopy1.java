package day01.demo04;

import java.util.Arrays;

public class arrayCopy1 {
    //arrayCopy 这是System类的一个方法，主要是将一个数组拷贝到另一个数组当中
    public static void main(String[] args) {
        int[] arr ={1,2,3,4};
        int[] arr1={5,6,7,8,9,10};
        System.arraycopy(arr,0,arr1,1,4);
        System.out.println(Arrays.toString(arr1));

    }
}
