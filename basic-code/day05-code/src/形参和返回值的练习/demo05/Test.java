package 形参和返回值的练习.demo05;

import java.util.ArrayList;

/*
2，在测试类中定义main方法。
	创建三个程序员对象。属性值随便写。

3，定义方法upperSalar。
	如果工作年限为 (0,2] 那么工资涨 500，
	如果工作年限为 (2,5] 那么工资涨 1500，
	如果工作年限为 (5,10] 那么工资涨 2500，
	如果工作年限为 (10,15] 那么工资涨 3500，
   并在方法中打印修改之后的程序员信息。
	打印格式如下：
		程序员小王，年龄30，工作年限10年，原工资为10000元，涨3500，涨后为13500.

4，定义方法getMaxSalar，找出工资最高的那个程序员并返回。
   并在main方法中打印其信息。

5.定义方法getMinAge，找出年龄最小的那个程序员并返回。
   并在main方法中打印其信息。
 */
public class Test {
    public static void main(String[] args) {
        Salar perA = new Salar("小万",26,4,8000);
        Salar perB = new Salar("小宝",25,10,7000);
        Salar perC = new Salar("小见",24,15,10000);
        ArrayList<Salar> list = new ArrayList<>();
        list.add(perA);
        list.add(perB);
        list.add(perC);
        upperSalar(list);
        Salar maxPer = getMaxSalar(list);
        System.out.println("工资最高人信息如下：");
        System.out.println("姓名："+maxPer.getName()+",工资："+maxPer.getMoneyAvg());
        Salar minPer = getMinAge(list);
        System.out.println("工资最低人信息如下：");
        System.out.println("姓名："+minPer.getName()+",工资："+minPer.getMoneyAvg());
    }
    public static void upperSalar(ArrayList<Salar> list){//涨工资
        //原工资
        int oldMoneyA = list.get(0).getMoneyAvg();
        int oldMoneyB = list.get(1).getMoneyAvg();
        int oldMoneyC = list.get(2).getMoneyAvg();
        ArrayList<Integer> listoldMoney = new ArrayList<>();
        listoldMoney.add(oldMoneyA);
        listoldMoney.add(oldMoneyB);
        listoldMoney.add(oldMoneyC);

        for (int i = 0; i < list.size(); i++) {
            int temp = list.get(i).getWorkAge();
            int moneyOld = list.get(i).getMoneyAvg();
            if (temp>0&&temp<=2){
                list.get(i).setMoneyAvg(moneyOld+500);
            }else if(temp>2&&temp<=5){
                list.get(i).setMoneyAvg(moneyOld+1500);
            }else if(temp>5&&temp<=10){
                list.get(i).setMoneyAvg(moneyOld+2500);
            }else if(temp>10&&temp<=15){
                list.get(i).setMoneyAvg(moneyOld+3500);
            }
            }
        for (int i = 0; i < list.size(); i++) {
            System.out.println("程序员" +list.get(i).getName()+","+
            "年龄"+list.get(i).getAge()+"，工作年限为"+list.get(i).getWorkAge()
                    +"原工资为"+listoldMoney.get(i)
                    +"年，涨工资"+(list.get(i).getMoneyAvg()-listoldMoney.get(i))
                    +"涨后工资为"+list.get(i).getMoneyAvg());
        }
        }
        public static Salar getMaxSalar(ArrayList<Salar> list){//获取公司最高人的对象函数
            int max= 0;
            if(list.get(0).getMoneyAvg()>list.get(1).getMoneyAvg()){
                max = list.get(0).getMoneyAvg();
                if(max>list.get(2).getMoneyAvg()){
                    return list.get(0);
                }else{
                    return list.get(2);
                }
            }else{
              max = list.get(1).getMoneyAvg();
                if(max>list.get(2).getMoneyAvg()){
                    return list.get(1);
                }else{
                    return list.get(2);
                }
            }
        }
    public static Salar getMinAge(ArrayList<Salar> list){//获取公司最低人的对象函数
        int min= 0;
        if(list.get(0).getMoneyAvg()<list.get(1).getMoneyAvg()){
            min = list.get(0).getMoneyAvg();
            if(min<list.get(2).getMoneyAvg()){
                return list.get(0);
            }else{
                return list.get(2);
            }
        }else{
            min = list.get(1).getMoneyAvg();
            if(min<list.get(2).getMoneyAvg()){
                return list.get(1);
            }else{
                return list.get(2);
            }
        }
    }
    }

