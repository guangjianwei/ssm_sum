package 形参和返回值的练习.demo03;
/*
1.定义"军人"类,Solider,包含以下成员：
成员属性：name（姓名）：String类型；age（年龄）：int类型；like(爱好)：String类型；属性使用private修饰
成员方法：
	1.get/set方法
	2.show（）方法，打印对象所有属性的值
2.定义类：Test，类中定义main（）方法，按以下要求编写代码：
	1.实例化三个Solider对象，三个对象分别为："王小兵"，25，"打篮球"、"李团长"，35，"游泳"、"王军长"，55，"踢足球"；
	2.定义方法,传递三个对象,如果对象的年龄大于40，那么将这个对象的爱好改成"打高尔夫",然后返回这个对象
	3.在main方法中调用该方法,接收返回的对象,调用这个对象的show（）方法展示这个对象所有的属性信息
 */
public class Solider {
   private String name;
    private int age;
   private String like;

    public Solider() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public Solider(String name, int age, String like) {

        this.name = name;
        this.age = age;
        this.like = like;
    }
    public void show(){
        System.out.println("姓名："+this.getName());
        System.out.println("年龄："+this.getAge());
        System.out.println("爱好："+this.getLike());
    }
}
