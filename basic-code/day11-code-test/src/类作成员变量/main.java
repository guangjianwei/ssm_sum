package 类作成员变量;

import 成员内部类.Body;

public class main {
    public static void main(String[] args) {
        Hero hero = new Hero("盖伦",20,new Weapon());
        System.out.println("年龄为"+hero.getName()+"年龄为"
                +hero.getAge()+"的英雄");
        hero.getPon().setName("多兰剑");
        hero.getPon().weaponWeapon();
    }
}
