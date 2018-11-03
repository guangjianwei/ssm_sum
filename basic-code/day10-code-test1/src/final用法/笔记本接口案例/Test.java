package final用法.笔记本接口案例;
//问题解析：首先，电脑是是使用Usb的，是使用usb进行鼠标和键盘的打开和关闭。
//usb作为接口，键盘和鼠标本身共有的功能都可以在进行抽象化，在各自的类中进行覆盖重写。
//之后电脑传入usb的类参数来进行函数的利用。
public class Test {
    public static void main(String[] args){
        Computer c = new Computer();
        Usb m = new Mouse();
        Usb k= new KeyBoard();
        c.Open();
        getEquipment(m);
        getEquipment(k);
        c.Close();
    }
    public static void getEquipment(Usb usb){
        if(usb instanceof Mouse){
             usb.equipmentOpen();
             usb.equipmentClose();
        }else if(usb instanceof KeyBoard){
            usb.equipmentOpen();
            usb.equipmentClose();
        }
    }

}
