package day01.demo05.Throw;

public class ThrowDemo {
    public static void main(String[] args) {
        get();
    }

    private static void get() {
        int i =1;
        if(i>0){
            throw new ArrayIndexOutOfBoundsException("数组越界啦？");
        }
    }
}
