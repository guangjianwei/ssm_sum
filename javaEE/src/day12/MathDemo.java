package day12;

public class MathDemo extends MathDemoFu{

    public  void getAbs(MathOther mathOther,int b) {
        System.out.println(mathOther.getAbs(b));
    }
    public  void getStr(MathOther2 mathOther2){
        mathOther2.getStr("傻吊宝！去吃屎");
        }
        public  void show(){
            getStr(s-> super.printInStr(s));
        }
        public  void show1(){
        getStr(s-> new MathDemoFu().printInStr(s));
    }
    public  void show2(){
                getStr(super::printInStr);
            }
}
