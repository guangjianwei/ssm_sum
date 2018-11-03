package final用法.笔记本接口案例;

public class Computer{

    public void useEquipment(Usb use) {
        use.equipmentOpen();
        use.equipmentClose();
        System.out.println();
    }
    public void Open(){
        System.out.println("打开电脑");
    }
    public void Close(){
        System.out.println("关闭电脑");
    }

}
