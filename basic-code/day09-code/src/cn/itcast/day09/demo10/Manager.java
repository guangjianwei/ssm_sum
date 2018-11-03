package cn.itcast.day09.demo10;
/*
1.定义项目经理类
		属性：
			姓名name 工号 工资 奖金
		行为：
			工作work
 */
public class Manager extends worker{
    @Override
    public void work(){
        System.out.println("经理工作");
    };

    public Manager() {
    }

    public Manager(String name, int workNum, int salary, int bonus) {
        super(name, workNum, salary, bonus);
    }
}
