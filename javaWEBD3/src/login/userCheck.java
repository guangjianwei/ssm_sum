package login;


import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

public class userCheck {
//    public static void main(String[] args) {
//        Map<String, String> map = new HashMap<>();
//        map.put("username", "sfdfds");
//        map.put("password", "123");
//        new userCheck().getMap(map);
//    }

    JdbcTemplate template = new JdbcTemplate(JDBCutils.getDataSource());

    public boolean getMap(Map<String, String> map) {
        try {
            String name = map.get("username");
            String pass = map.get("password");
            String sql1 = "SELECT * FROM USER WHERE username=? AND PASSWORD=?";
            List<Map<String, Object>> som = template.queryForList(sql1, name, pass);
            if (som.isEmpty()){
                System.out.println("验证错误");
                return false;

            } else {
                System.out.println("验证正确");
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;

        }
    }

}
