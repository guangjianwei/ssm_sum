package Jedis.utils;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class JedisPoolTest {
    //jedis连接池： JedisPool用法
    public static void main(String[] args) {
        //创建一个配置对象
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxIdle(10);//最大的空闲连接
        config.setMaxTotal(50);//允许的最大连接数
        //创建Jedis连接池对象
        JedisPool jedisPool = new JedisPool(config,"localhost",6379);
        //获取连接
        Jedis jedis = jedisPool.getResource();
        //使用使用
        jedis.set("hellow","word");
        String hellow = jedis.get("hellow");
        System.out.println(hellow);
        //关闭连接/归还连接
        jedis.close();
    }
}
