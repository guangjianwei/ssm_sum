package 商品购物秒杀活动;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

//项目入口
public class test {
    public static int count = 0;

    public static void main(String[] args) throws IOException, ParseException {
        Scanner sc = new Scanner(System.in);

        a:
        while (true) {
            System.out.println("请选择是否参加秒杀活动(1代表参加,2代表不参加)");
            String chosOne = sc.nextLine();
            if (chosOne.equals("1")) {
                boolean b = setTime();//设置时间
                if (b == false) {
                    System.out.println("对不起,活动已经截止!");
                    break;
                }
                chosGoods(); //商品类别
                System.out.println("用户已经成功选择了商品的类别");

                System.out.println("ggggggggg");
                break;
            }
            if (chosOne.equals("2")) {
                System.out.println("感谢您的光顾，再见......");
                return;
            } else {
                System.out.println("对不起，您的选择有误，请重新选择！");
            }
        }

    }

    private static boolean setTime() throws IOException, ParseException {
        Properties pro = new Properties();
        pro.load(new InputStreamReader(new FileInputStream("src\\商品购物秒杀活动\\endtime.properties"), "gbk"));
        String endtime = pro.getProperty("endtime");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = sdf.parse(endtime);
        long strEnd = parse.getTime();
        long strStar = System.currentTimeMillis();
        if (strEnd >= strStar) {
            return true;
        } else {
            return false;
        }
    }

    public static void chosGoods() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("参加秒杀活动的商品分类信息如下：");
        a:
        while (true) {
            System.out.println("1=酒水饮料    2=汽车用品    3=数码家电    4=水果生鲜");
            System.out.println("请选择：");
            String chosTwo = sc.nextLine();
            switch (chosTwo) {
                case "1":
                    System.out.println("酒水饮料");
                    showGoods("酒水饮料");
                    break;
                case "2":
                    System.out.println("汽车用品");
                    showGoods("汽车用品");
                    break;
                case "3":
                    System.out.println("数码家电");
                    showGoods("数码家电");
                    break;
                case "4":
                    System.out.println("水果生鲜");
                    showGoods("水果生鲜");
                    break;
                default:
                    System.out.println("对不起，您选择的商品分类不存在，请问还要继续进行选择吗？(1是，2否)");
                    String chosFour = sc.nextLine();
                    if (chosFour.equals("1")) {
                        break;
                    } else {
                        break a;
                    }
            }
            return;
        }
    }

    //商品类的选择
    public static void showGoods(String name) throws IOException {
        //声明一个集合,用来存储商品类
        List<Goods> list = new ArrayList<>();
        String names = "src\\商品购物秒杀活动\\" + name + ".txt";
        File file = new File(names);
        long length = file.length();
        if (length == 0) {
            System.out.println("该类的商品已经售空了，请重新选择");
            chosGoods();
        }

        BufferedReader br = new BufferedReader(new FileReader(file));
        String str;
        System.out.println("名称            数量          产地         价格");
        while ((str = br.readLine()) != null) {
            String[] split = str.split(",");
            String strCount = null;
            int a = Integer.parseInt(split[1]);
            double b = Double.parseDouble(split[3]);
            if (a >= 5) {
                strCount = "充足";
            }
            if (a > 2 && a < 5) {
                strCount = "有货";
            }
            if (a >= 1 && a <= 2) {
                strCount = "紧缺";
            }
            if (a == 0) {
                strCount = "售空";
            }

            //实例一个对象
            Goods gods = new Goods(split[0], a, split[2], b);
            list.add(gods);
            System.out.println(split[0] + "          " + strCount + "        " + split[2] + "          " + split[3]);

        }
        chosGood(list, name);//选择具体商品`
        System.out.println("用户已经已经选择了具体商品");

    }

    //具体的商品的选择
    public static void chosGood(List<Goods> list, String name) throws IOException {//这个name是用户选择的产品种类
        //声明一个集合,用来当做购物车
        List<ShopList> listShop = new ArrayList<>();
        b:
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入选择的商品名称:");
            String str = sc.nextLine();
            for (Goods goods : list) {
                String strdd = goods.brand;//输入的商品名称
                int mm = goods.num; //仓库中还拥有的商品数量
                if (strdd.equals(str)) {
                    System.out.println("您选择的商品类别存在");
                    if (mm == 0) {
                        System.out.println("对不起,你选择的商品不存在(售空)!是否重新要重新输入商品名称(n/y)");
                        String str1 = sc.nextLine();
                        if (str1.equals("n")) {
                            System.out.println("当前商品购买失败,是否选择重新购买,该商品分类中的其他商品(n/y)");
                            String str2 = sc.nextLine();
                            if (str2.equals("n")) {
                                break;
                            } else {
                                continue;
                            }
                        } else {
                            continue b;
                        }
                    } else {
                        System.out.println("当前商品购买成功,是否选择重新购买该商品分类中的其他商品(n/y)");
                        System.out.print("商品有:");
                        for (Goods goods1 : list) {
                            System.out.print(goods1.brand + "   ");
                        }
                        System.out.println();
                        String str3 = sc.nextLine();
                        if (str3.equals("n")) {
                            //这里代表客户已经选择了商品,接下来是要选择商品的数量
//                           String strdd = goods.brand;//输入的商品名称
//                         int mm = goods.num; //仓库中还拥有的商品数量
                            Person per = new Person();
                            per.setName("傻逼宝");
                            ShopList shopList = new ShopList();
                            shopList.perName = per.getName();
                            shopList.perBrand = strdd;
                            double price = 0;
                            for (Goods goods1 : list) {
                                if(strdd.equals(goods1.brand)){
                                    price = goods1.prece;
                                }
                            }
                            shopList.perPrice = price;
                            listShop.add(shopList);
                            while (true) {
                                System.out.println("请输入您所要购买的商品数量:");
                                String str4 = sc.nextLine();
                                int num = Integer.parseInt(str4);
                                //这时候的mm要从库存中重新获取,不能直接从上方的list集合中获取
                                String names = "src\\商品购物秒杀活动\\" + name + ".txt";
                                File file = new File(names);
                                long length = file.length();
                                if (length == 0) {
                                    System.out.println("该类的商品已经售空了，请重新选择");
                                    chosGoods();
                                }
                                BufferedReader br = new BufferedReader(new FileReader(file));
                                while ((str = br.readLine()) != null) {
                                    String[] split = str.split(",");
                                    if (split[0].equals(strdd)) {
                                        mm = Integer.parseInt(split[1]);//获取库存中的商品数量
                                    }
                                }
                                if (num < 0 || num > mm) {
                                    System.out.println("对不起,你选择的数量已经超出库存数或者选择有误,请重新输入...");
                                    continue;
                                }
                                shopList.perCount = num;
                                System.out.println("已经成功把商品加入到购物车");
                                //这里要把商品新的数量加载到库存当中(name是产品所属的种类)
                                int newCount = mm - num;
                                //遍历集合
                                for (Goods goods1 : list) {
                                    String str6 = goods1.brand;
                                    if (str6.equals(strdd)) {
                                        goods1.num = newCount;
                                    }
                                }
                                for (Goods goods1 : list) {
                                    System.out.println(goods1.num);
                                }
                                //后存
                                String newFile = "src\\商品购物秒杀活动\\" + name + ".txt";
                                BufferedWriter bw = new BufferedWriter(new FileWriter(newFile));
                                for (Goods goods1 : list) {
                                    String temp = goods1.brand + "," + goods1.num + "," + goods1.dddress + "," + goods1.prece;
                                    bw.write(temp);
                                    bw.newLine();
                                }
                                bw.close();
                                System.out.println("商品库存数量已经成功改变");
                                System.out.println("请选择是否继续购买商品!(n/y)");
                                String str5 = sc.nextLine();
                                if (str5.equals("n")) {
                                    //是否选择配送
                                    distructionGoods(list,listShop);
                                    break b;

                                } else {
                                    System.out.print("商品有:");
                                    for (Goods goods1 : list) {
                                        System.out.print(goods1.brand + "   ");
                                    }
                                    continue b;
                                }

                            }


                        } else {
                            continue b;
                        }
                    }


                }
            }
            System.out.println("对不起,你选择的商品不存在!是否重新要重新输入商品名称(n/y)");
            String str1 = sc.nextLine();
            if (str1.equals("n")) {
                System.out.println("当前商品购买失败,是否选择重新购买,该商品分类中的其他商品(n/y)");
                String str2 = sc.nextLine();
                if (str2.equals("n")) {
                    break;
                }
                continue;
            }
            continue;
        }

    }

    private static void distructionGoods(List<Goods> list,  List<ShopList> listShop) throws IOException {
        if(listShop.size()!=0){
            Scanner sc = new Scanner(System.in);
            System.out.println("请问是否需要配送(n/y)");
            String str6 = sc.nextLine();
            if(str6.equals("y")){
                System.out.println("请输入用户名:");
                String perName  = sc.nextLine();
                System.out.println("请输入联系方式:");
                String num =sc.nextLine();
                //判断距离，加载到.txt中
            }else{
                System.out.println("请输入用户名:");
                String perName1  = sc.nextLine();
                System.out.println("请输入联系方式:");
                String num1 =sc.nextLine();
                //直接打印清单,加载到.txt中
                String sss = "src\\商品购物秒杀活动\\不配送用户\\"+perName1+".txt";
                File file = new File(sss);
                BufferedWriter bw =new BufferedWriter(new FileWriter(file));
                bw.write("姓名:"+perName1);
                bw.newLine();
                bw.write("练习电话:"+num1);
                bw.newLine();
                bw.write("您购买的商品如下:");
                bw.newLine();
                bw.write("商品名称   商品单价    商品个数    商品总价");
                bw.newLine();
                int count=0;//商品总价
                for (ShopList goods : listShop) {
                    count+=(goods.perPrice*goods.perCount);
                    bw.write(goods.perBrand+"       "+goods.perPrice+"      "+goods.perCount+"      " +
                            "      "+(goods.perPrice*goods.perCount) );
                    bw.newLine();
                }
                bw.write("商品总价为:"+count);
                bw.close();
            }
        }
        return;
    }
}
