package cn.itcast.day09.demo11;
/*
定义Person类
		属性：
			姓名，年龄
		行为：
			keepPet(Dog dog,String something)方法
				功能：喂养宠物狗，something表示喂养的东西
		行为：
			keepPet(Cat cat,String something)方法
				功能：喂养宠物猫，something表示喂养的东西
		生成空参有参构造，set和get方法
 */
public class Person {
    private String name;
    private int age;
    public void keepPet(Dogs dog,String something){
        System.out.println("功能：用"+something+"喂养宠物狗");
    }
    public void keepPet(Cats cat,String something){
        System.out.println("功能：用"+something+"喂养宠物猫");
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

    public Person(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public Person() {

    }
}
