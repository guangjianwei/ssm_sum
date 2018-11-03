package 接口做成员变量;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class main {
    public static void main(String[] args) {
        Kill kill =new Kill() {
            @Override
            public void killOther() {
                System.out.println("Biu-bbbbbbbbbbb");
            }
        };
        Hero hero = new Hero("艾希",20,kill);
        System.out.println("我叫"+hero.getName()+"年龄为"+hero.getAge());
        System.out.println("开始释放技能：");
        kill.killOther();
    }
}
