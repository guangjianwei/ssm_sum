package day01.StringBuiler;

public class demo {
    //StringBuilder的使用
    public static void main(String[] args) {
        StringBuilder stb = new StringBuilder();
        stb.append("物理化学");
        stb.append(123);
        stb.append('a');
        stb.append(new Person("段正淳",33));
        System.out.println(stb.toString());
    }
}
