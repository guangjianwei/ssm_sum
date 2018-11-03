package cn.itcast.day09.demo10;
/*
2.定义程序员类
		属性：
			姓名 工号 工资
		行为：
			工作work
 */
public class Coder extends worker{
    public Coder(String name, int workNum, int salary, int bonus) {
        super(name, workNum, salary, bonus);
    }

    public Coder() {
    }

    @Override
    public void work(){
        System.out.println("程序员工作");
    }
}
