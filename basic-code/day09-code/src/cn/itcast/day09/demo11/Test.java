package cn.itcast.day09.demo11;
/*
1.定义动物类
		属性：
			年龄，颜色
		行为:
			eat(String something)方法(无具体行为,不同动物吃的方式和东西不一样,something表示吃的东西)
			生成空参有参构造，set和get方法

	2.定义狗类继承动物类
		行为:
			eat(String something)方法,看家lookHome方法(无参数)

	3.定义猫类继承动物类
		行为:eat(String something)方法,逮老鼠catchMouse方法(无参数)

	4.定义Person类
		属性：
			姓名，年龄
		行为：
			keepPet(Dog dog,String something)方法
				功能：喂养宠物狗，something表示喂养的东西
		行为：
			keepPet(Cat cat,String something)方法
				功能：喂养宠物猫，something表示喂养的东西
		生成空参有参构造，set和get方法

	5.测试以上方法
 */
public class Test {
    public static void main(String[] args) {
        Person person = new Person("傻逼宝",30);
        Cats cat = new Cats();
        Dogs dog = new Dogs();
        person.keepPet(cat,"肉");
        person.keepPet(dog,"鱼");
        System.out.println("猫");
        cat.catchMouse();
        System.out.println("傻屌宝");
        dog.lookHome();

    }
}
