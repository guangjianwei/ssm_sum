package login;

import java.util.HashMap;
import java.util.Map;


public class test2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("username", "");
        map.put("password", "");
        System.out.println(map);
        boolean map1 = new userCheck().getMap(map);
        System.out.println(map1);


    }
}
