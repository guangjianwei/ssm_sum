package demo02;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Scanner sc = new Scanner(System.in);
           list.add(sc.next()); //匹配字符串
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i)+",");
        }
    }
}
