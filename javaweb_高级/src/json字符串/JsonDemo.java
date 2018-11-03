package json字符串;

import java.util.ArrayList;
import java.util.List;

/**
 * 基本规则
 * 数据在名称/值对中：json数据是由键值对构成的
 * 键用引号(单双都行)引起来，也可以不使用引号
 * 值得取值类型：
 * 1. 数字（整数或浮点数）
 * 2. 字符串（在双引号中）
 * 3. 逻辑值（true 或 false）
 * 4. 数组（在方括号中）	{"persons":[{},{}] , "id":"1"}
 * 5. 对象（在花括号中） {"address":{"province"："陕西"....}}
 * 6. null
 * 数据由逗号分隔：多个键值对由逗号分隔
 * 花括号保存对象：使用{}定义json 格式
 * 方括号保存数组：[]
 * 多对数据之间使用 , 分隔,  不要和java搞混了以为是 ; 分隔
 * <p>
 * ｛ key : value , key : value , key : value ｝
 *  [ value , value , value ]
 * ｛ key : [ value , value ] , key : value , key : value ｝
 *
 * ｛ key = value , key = value , key = value }            没有这种写法
 *
 *
 *
 * json格式的字符转换
 * ObjectMapper objectMapper = new ObjectMapper();
 * //方式一
 * objectMapper.writeValue(response.getOutputStream(),map);
 *
 * //方式二
 * String s = objectMapper.writeValueAsString(obj)
 * response.getOutputStream().write(s.getBytes());
 *
 *
 * 注意点:
 * 如果后台返回的不是json字符串,而是string, 那么得到的结果就是string字符串
 *
 * 返回结果是json字符串有两种方式:
 * 一种是ajax请求的时候
 * $.post("${pageContext.request.contextPath}/findUsername",
 *      {username:username},
 *          function (data) {
 *          if (data.exist){
 *          checkMsg.css("color","red");
 *          }else {
 *          checkMsg.addClass("error")
 *          }
 *          checkMsg.html(data.msg);
 *          },
 *      "json");
 *
 * 一种是后台返回数据
 * String mimeType = getServletContext().getMimeType(".json");
 * response.setContentType(mimeType);
 *
 */


public class JsonDemo {
    public static void main(String[] args) throws JsonProcessingException {
        List<User> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            User user = new User("zhangsan" + i, 20 + i, "男");
            list.add(user);
        }
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(list);
        System.out.println(json);
        //       [
        //           {"username":"zhangsan0","age":20,"sex":"男"},
        //           {"username":"zhangsan1","age":21,"sex":"男"},
        //           {"username":"zhangsan2","age":22,"sex":"男"},
        //           {"username":"zhangsan3","age":23,"sex":"男"},
        //           {"username":"zhangsan4","age":24,"sex":"男"}
        //       ]

    }

    static class User {
        private String username;
        private int age;
        private String sex;

        public User(String username, int age, String sex) {
            this.username = username;
            this.age = age;
            this.sex = sex;
        }

        @Override
        public String toString() {
            return "User{" +
                    "username='" + username + '\'' +
                    ", age=" + age +
                    ", sex='" + sex + '\'' +
                    '}';
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }
    }

}
