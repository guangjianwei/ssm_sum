package 测试;
/*
1.定义长度为100的整数类型数组,并对数组进行赋值1-100之间的整数数据(包括1和100),
2.定义方法,传递数组,将数组中元素能同时被3和5整除的存入到新数组中,并将新数组返回
3.定义方法,传递数组及一个整数数据,判断该数据在数组中是否存在,如果存在,则打印该元素在数组中出现的位置,
如果不存在则提示"不存在"
4.定义print方法,打印传递的数组内的元素,打印格式如下:数组元素:[元素1,元素2,元素3...]
*/
public class Num3 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int a = 20;
        for (int i = 0; i < 100; i++) {
            int temp = i + 1;
            arr[i] = temp;
        }
        findArray(arr, a);
        int len = arr.length;
        System.out.print("[");
        for (int i = 0; i < len; i++) {
            if (i == len - 1) {
                System.out.print(arr[i] + "]");
            } else {
                System.out.print(arr[i]);
                System.out.print(",");
            }
        }
        int[] arr1 = getOne(arr);
        System.out.println("");
        System.out.print("[");
        for (int i = 0; i < arr1.length; i++) {
            if (i == arr1.length - 1) {
                System.out.print(arr1[i] + "]");
            } else {
                System.out.print(arr1[i]);
                System.out.print(",");
            }
        }
    }
        public static int[] getOne ( int arr[]){
            int j = 0;
            int count = 0;
            for (int i = 0; i < 100; i++) {
                if(arr[i] % 3 == 0 && arr[i] % 5 == 0){
                    count++;}
                    }
            int[] arr1 =new int[count];
            for (int i = 0; i < 100; i++) {
                if (arr[i] % 3 == 0 && arr[i] % 5 == 0) {
                    arr1[j] = arr[i];
                    j++;
                }
            }
            return arr1;

        }
        public static void findArray ( int[] arr, int a){
            for (int i = 0; i < 100; i++) {
                if (arr[i] == a) {
                    System.out.println("存在：在第" + (i + 1) + "号的位置！");

                }
            }
            System.out.println("不存在");
        }

}
