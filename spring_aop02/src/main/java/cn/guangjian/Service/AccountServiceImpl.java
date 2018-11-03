package cn.guangjian.Service;

public class AccountServiceImpl implements AccountService {
    public void save() {
        System.out.println("模拟保存。。。");
    }

    public int update() {
        System.out.println("模拟修改。。。");
        return 2;
    }

    public void find(Integer integer) {
        System.out.println("模拟查找。。。"+integer);
    }
}
