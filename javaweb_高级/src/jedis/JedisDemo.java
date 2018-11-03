package jedis;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Jedis工具类
 */
public class JedisDemo {

    public static void main(String[] args) {
        //获得jedis连接池
        JedisPool jedisPool = new JedisPool(config, "localhost", 6379);
        //获取到jedis执行对象
        Jedis jedis = jedisPool.getResource();
        //执行jedis操作
        jedis.set("name","1235780");
        //关闭连接
        jedis.close();
    }
}
