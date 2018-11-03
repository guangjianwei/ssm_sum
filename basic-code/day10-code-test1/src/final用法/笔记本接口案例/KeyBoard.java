package final用法.笔记本接口案例;

public class KeyBoard implements Usb{
    @Override
    public void equipmentOpen() {
        System.out.println("打开键盘");
    }

    @Override
    public void equipmentClose() {
        System.out.println("打开键盘");
    }
}
