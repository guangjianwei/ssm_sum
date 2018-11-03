/*
1.定义Person类, 包含以下成员:
成员属性:
name (姓名)：String类型;
height (身高) ：double类型;
weight (体重) ：int类型
属性使用private修饰。
成员方法:
1).get/set方法
2).无参无返回值的非静态showBMI()方法, 打印对象的姓名,体重,身高和体质指数:
体质指数=体重÷(身高*身高);
2. 定义Test类：在main()方法中，按以下要求编写代码:
    1） 分别实例化三个Person对象，三个对象分别为："小秋" ,1.72, 72、"小红" ,1.58, 44、"小白" ,1.80, 55;
    2） 创建一个ArrayList集合，这个集合里面存储的是Person类型，分别将上面的三个Person对象添加到集合中
3）遍历这个集合，将集合中的第3个对象，体重增加10kg，然后调用这个对象的showBMI方法展示这个对象的属性和体质指数.
控制台打印示例：
小白身高为1.8,体重为65,体质指数是:21
 */
public class Person {
    private String name;
    private double height;
    private int weight;
    public void showBMI(){
        System.out.println("姓名："+name);
        System.out.println("身高："+height);
        System.out.println("体重："+weight);
        System.out.println("体质指数："+weight/(height*height));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Person(String name, double height, int weight) {

        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public Person() {

    }
}
