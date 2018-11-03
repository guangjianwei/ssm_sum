package Jedis.utils;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class JedisPoolUtils {
    //首先读取配置文件
    static JedisPool jedisPool = null;
    static {
        //获取输入流
        InputStream in = JedisPoolUtils.class.getClassLoader().getResourceAsStream("jedis.properties");
        //加载
        Properties pro = new Properties();
        try {
            pro.load(in);//这里需要抓取异常
        } catch (IOException e) {
            e.printStackTrace();
        }
        //获取数据设置到我们的JedisPoolConfig中
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxTotal(Integer.parseInt(pro.getProperty("maxTotal")));
        config.setMaxIdle(Integer.parseInt(pro.getProperty("maxIdle")));
        //初始化JedisPool
         jedisPool = new JedisPool(config,pro.getProperty("host"), Integer.parseInt(pro.getProperty("port")));

    }
    public static Jedis getJedis(){
        return jedisPool.getResource();
    }
}
