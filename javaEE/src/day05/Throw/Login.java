package day05.Throw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//写一个登陆异常的提示
public class Login {
    public static void main(String[] args){
        ArrayList<String> nameList = new ArrayList<>(List.of("aaa","bbb","ccc"));
        System.out.println("请输入账号：");
        String sc = new Scanner(System.in).nextLine();
        try {
            useNameLogin(sc,nameList);
            System.out.println("恭喜你，注册成功！");
        } catch (LoginEexception loginEexception) {
            loginEexception.printStackTrace();
            System.out.println("对不起，注册失败！");
        }
    }

    private static void useNameLogin(String sc,ArrayList<String> list) throws LoginEexception {
        for (String s : list) {
            if(s.equals(sc)){
                throw new LoginEexception();
            }
        }
    }
}
