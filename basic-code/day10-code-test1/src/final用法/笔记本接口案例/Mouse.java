package final用法.笔记本接口案例;

public class Mouse implements Usb {
    @Override
    public void equipmentOpen() {
        System.out.println("打开鼠标");
    }

    @Override
    public void equipmentClose() {
        System.out.println("关闭鼠标");
    }
}
