package day12.newArrayLanmbda;

public class main {
    public static void main(String[] args) {
        int[] array = initArray((n)->{
            return new int[n];
        },5);
        int[] array1 = initArray(n-> new int[n],5);
        int[] array2 = initArray(int[]::new,6);
        System.out.println(array2.length);
    }
    public static int[] initArray(builderArray ba ,int length){
       return ba.builderArray(length);
    }
}
