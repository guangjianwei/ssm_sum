package test;


public class test {
    public static void main(String[] args) {
        Fu fu = new Fu() {
            @Override
            public void study() {
                System.out.println("天天向上");
            }
        };
        fu.stu();
    }


}
