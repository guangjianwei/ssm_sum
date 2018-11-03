package Jedis;

import Jedis.utils.JedisPoolUtils;
import org.junit.Test;
import redis.clients.jedis.Jedis;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * . Java客户端 Jedis
 * Jedis: 一款java操作redis数据库的工具.
 * 使用步骤：
 1. 下载jedis的jar包
 2. 使用
 //1. 获取连接
 Jedis jedis = new Jedis("localhost",6379);
 //2. 操作
 jedis.set("username","zhangsan");
 //3. 关闭连接
 jedis.close();
 */
public class JedisTest {
    @Test
    public void StringTest() {
        //获取连接
        Jedis jedis = new Jedis("localhost",6379);
        //操作
        jedis.set("username","zhangsan");
        //获取
        System.out.println(jedis.get("username"));
        //关闭连接
        jedis.close();

    }
    @Test
    public void String1Test() {
        //获取连接
        Jedis jedis = new Jedis("localhost",6379);
        //操作
        jedis.set("username","zhangsan");
        //获取
        String username = jedis.get("username");
        System.out.println("这是获取到的username:"+username);
        ////可以使用setex()方法存储可以指定过期时间的 key value
        jedis.setex("user",30,"lisi");
        //关闭连接
        jedis.close();

    }
    @Test
    public void HashTest() {
        //哈希类型 hash ： map格式
        //获取连接
        Jedis jedis = new Jedis("localhost",6379);
        //存值
        jedis.hset("user","username","zhangsan");
        jedis.hset("user","password","123");
        jedis.hset("user","age","25");
        //获取hash
        String name = jedis.hget("user","username");
        System.out.println("获取到的hash中name为:"+name);
        //获取其中所有数据
        Map<String, String> user = jedis.hgetAll("user");
        Set<String> keySet = user.keySet();
        for (String s : keySet) {
            System.out.println("username:"+s+",password:"+user.get(s));
        }
        //关闭连接
        jedis.close();

    }
    @Test
    public void ListTest() {
        //列表类型 list ： linkedlist格式。支持重复元素
        //获取连接
        Jedis jedis = new Jedis("localhost",6379);
        //存值
        jedis.lpush("mylist","a","b","c");
        jedis.rpush("mylist","a","b","c");
        //list范围获取
        List<String> mylist = jedis.lrange("mylist", 0, -1);
        System.out.println(mylist);
        //lsit弹出
        String mylist1 = jedis.lpop("mylist");
        System.out.println("从左边弹出的是:"+mylist1);
        String mylist2 = jedis.rpop("mylist");
        System.out.println("从右边弹出的是:"+mylist2);
        //重新获取list
        List<String> mylist3= jedis.lrange("mylist",0,-1);
        System.out.println("新的list是:"+mylist3);
        //关闭连接
        jedis.close();

    }
    @Test
    public void SetTest() {
        //集合类型 set  ： 不允许重复元素
        //获取连接
        Jedis jedis = new Jedis("localhost",6379);
        //存值
        jedis.sadd("myset","php","c++","java");
        //获取
        Set<String> myset = jedis.smembers("myset");
        System.out.println(myset);
        //关闭连接
        jedis.close();

    }
    @Test
    public void SortedsetTest() {
        //有序集合类型 sortedset：不允许重复元素，且元素有顺序
        //获取连接
        Jedis jedis = new Jedis("localhost",6379);
        //存储
        jedis.zadd("mysortedset",3,"孙悟空");
        jedis.zadd("mysortedset",100,"猪八戒");
        jedis.zadd("mysortedset",50,"唐僧");
        //获取
        Set<String> mysortedset = jedis.zrange("mysortedset", 0, -1);
        System.out.println(mysortedset);
        //关闭连接
        jedis.close();

    }
    @Test
    public void StringTest1() {
        //获取连接
       // Jedis jedis = new Jedis("localhost",6379);
        Jedis jedis = JedisPoolUtils.getJedis();
        //操作
        jedis.set("username","zhangsan");
        //获取
        System.out.println(jedis.get("username"));
        //关闭连接
        jedis.close();

    }
}
