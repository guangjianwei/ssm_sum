package 类作成员变量;
//类作为成员变量来使用
//结果：姓名为 盖伦 的年龄为20英雄用多兰剑攻击敌人。
public class Hero {
   private String name;
    private int age;
   private Weapon pon ;

    public Hero() {
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

    public Weapon getPon() {
        return pon;
    }

    public void setPon(Weapon pon) {
        this.pon = pon;
    }

    public Hero(String name, int age, Weapon pon) {

        this.name = name;
        this.age = age;
        this.pon = pon;
    }
}
