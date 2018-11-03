package demo01.num3;
/*
1.定义“玩家类”Player，包含满参构造方法和以下成员：
	成员属性：
		等级level（int类型）
 */
public class Player {
   private int level;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Player(int level) {

        this.level = level;
    }

    public Player() {

    }
}
