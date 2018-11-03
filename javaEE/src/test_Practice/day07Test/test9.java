package test_Practice.day07Test;
/*

 */
public class test9 {
    public static void main(String[] args) {
// 2.在此使用Lambda【省略格式】调用invokeDirect方法
        invokeDirect(() -> System.out.println("导演拍电影啦！"));
    }

    private static void invokeDirect(Director director) {
        director.makeMovie();
    }
}
