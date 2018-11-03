package Test.TestOne;

public abstract class Person {
   public  String name;
   public int age;
   public static int count;//设置一个静态的count，用来在作为常见对象的表示
    public abstract void work();

    public Person() {
    }

    public Person(String name, int age) {
       if(age<0){
           throw new MyException("对不起，你输入的人员年龄违法");
           }else{
           this.name = name;
           this.age = age;
       }
      count++;
    }
}
