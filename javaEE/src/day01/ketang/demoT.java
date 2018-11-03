package day01.ketang;
//泛型方法的使用
public class demoT {
    public static void main(String[] args) {
         class Demo{
            public <T> void get(T t){
                System.out.println(t);
            }
        }
        Demo demo = new Demo();
        demo.get("武林太极八卦掌");
    }

}

