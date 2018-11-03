package 类作成员变量;

public class Weapon {
    private String name;

    public void weaponWeapon() {
        System.out.println("用" + name + "攻击敌人");
    }

    public Weapon() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon(String name) {

        this.name = name;
    }
}
