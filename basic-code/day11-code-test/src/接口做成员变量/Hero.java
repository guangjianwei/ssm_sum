package 接口做成员变量;

public class Hero {
    private String name;
    private int age;
    private Kill kill;

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

    public Kill getKill() {
        return kill;
    }

    public void setKill(Kill kill) {
        this.kill = kill;
    }

    public Hero(String name, int age, Kill kill) {
    
        this.name = name;
        this.age = age;
        this.kill = kill;
    }

    public Hero() {
    
    }
}
