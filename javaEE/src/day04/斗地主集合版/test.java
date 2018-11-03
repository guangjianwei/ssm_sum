package day04.斗地主集合版;

import java.util.*;

/*
具体规则：
1.组装54张扑克牌
2.54张扑克牌的顺序打乱
3.三个玩家参与游戏，三人交替摸牌，没人17张，最后三张留底
4.查看玩家手中的牌，按照大小的顺序。还有底牌
解析：
和之前斗地主的区别是，之前都地主么有办法按照一定的顺序进行牌型的大小顺序显示
现在要进行牌型的大小顺序显示。
1，一个大集合（Map）和三个小集合（两个集合合并成一个集合存放拼接好的牌）
2.把所有的牌放入我们的Map中，然后进行洗牌
3.发牌
4.根据发牌的键值进行亮牌。
 */
public class test {
    public static void main(String[] args) {
        Map<Integer,String> mapBox =new HashMap<>();
        int count =0;
        mapBox.put(count,"大★");
        count++;
        mapBox.put(count,"小★");
        count++;
        Set<String> setString =Set.of("2","A","J","Q","K","10","9","8","7","6","5","4","3");
        Set<String> setColor =Set.of("♠","♥","♣","♦");
        for (String s : setColor) {
            for (String s1 : setString) {
                mapBox.put(count,s+s1);
                count++;
            }
        }
        //创建三个数组集合存放mapBox集合中的键
        ArrayList<Integer> list1 =new ArrayList<>();
        ArrayList<Integer> list2 =new ArrayList<>();
        ArrayList<Integer> list3 =new ArrayList<>();
        ArrayList<Integer> last =new ArrayList<>();
        Set<Integer> strings = mapBox.keySet();
        List<Integer> listInteger = new ArrayList<>(strings);
        Collections.shuffle(listInteger);
        for (int i = 0; i < listInteger.size(); i++) {
            if(listInteger.get(i)>=51){
                last.add(listInteger.get(i));
            }else {
                if (listInteger.get(i) % 3 == 0) {
                    list1.add(listInteger.get(i));
                } else if (listInteger.get(i) % 3 == 1) {
                    list2.add(listInteger.get(i));
                } else {
                    list3.add(listInteger.get(i));
                }
            }
        }
        //亮牌
        Collection<String> player1 = new ArrayList<>();
        Collection<String> player2 = new ArrayList<>();
        Collection<String> player3 = new ArrayList<>();
        Collection<String> lastCar = new ArrayList<>();
        for (Integer integer : list1) {
            player1.add(mapBox.get(integer));
            }
        for (Integer integer : list2) {
            player2.add(mapBox.get(integer));
        }
        for (Integer integer : list3) {
            player3.add(mapBox.get(integer));
        }
        for (Integer integer : last) {
            lastCar.add(mapBox.get(integer));
        }
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println(lastCar);

    }
}
