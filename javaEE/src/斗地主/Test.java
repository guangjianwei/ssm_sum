package 斗地主;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
思路：1.创建牌
     a.先创建一个大的牌型集合Card,在创建两个小集合分别装字色集合和花色集合。
     b.填充两个小集合后，进行拼接，装在Card集合里面。（完成牌盒的创建）
     2.洗牌
     利用集合的shuff的方法进行自动洗牌
     3.发牌
     创建三个玩家集合，利用集合索引%3取余为1,2，3.的算法进行玩家发牌。
     遍历玩家牌集合。
 */
public class Test {
    public static void main(String[] args) {
        //创建牌盒
        ArrayList<String> CardAll = new ArrayList<>();
        //花色集合
        ArrayList<String> CardColor = new ArrayList<>(List.of("♠","♥","♣","♦"));
        //数字集合
        ArrayList<String> CardNumber = new ArrayList<>();
        for (int i = 2; i <=10; i++) {
            CardNumber.add(i+"");
        }
        CardNumber.add("J");
        CardNumber.add("Q");
        CardNumber.add("K");
        CardNumber.add("A");
        CardAll.add("小❉");
        CardAll.add("大✿");
        for (String strCo: CardColor) {
            for (String strNum: CardNumber) {
                CardAll.add(strCo+strNum);
            }
        }
        System.out.print("洗牌前：");
        System.out.println(CardAll);
        Collections.shuffle(CardAll);
        System.out.print("洗牌后：");
        System.out.println(CardAll);
        //生成三个玩家和一个底牌集合
        ArrayList<String> playerOne = new ArrayList<>();
        ArrayList<String> playerTwo = new ArrayList<>();
        ArrayList<String> playerThree = new ArrayList<>();
        ArrayList<String> CardResidue = new ArrayList<>();
        for (int i = 0; i < CardAll.size(); i++) {
            if(i>=51){
                CardResidue.add(CardAll.get(i));
            }else if(i%3==0){
                playerOne.add(CardAll.get(i));
            }else if(i%3==1){
                playerTwo.add(CardAll.get(i));
            }else{
                playerThree.add(CardAll.get(i));
            }
        }
        System.out.println("==========发牌===========");
        System.out.print("玩家一：");
        System.out.println(playerOne);
        System.out.print("玩家二：");
        System.out.println(playerTwo);
        System.out.print("玩家三：");
        System.out.println(playerThree);
        System.out.print("底牌：");
        System.out.println(CardResidue);

    }


}
