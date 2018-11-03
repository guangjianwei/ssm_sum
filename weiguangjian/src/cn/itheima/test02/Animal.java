package cn.itheima.test02;
/*
创建Animal（动物）抽象类，包含：

                成员属性：姓名（name），String类型。

                有参无返回值的抽象方法：void speak (String str)。
 */
public abstract class Animal {
    public Animal() {
    }

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void speak(String str);
}
