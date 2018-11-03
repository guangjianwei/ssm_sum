package guangjian.service.serviceImpl;

import Jedis.utils.JedisPoolUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import guangjian.dao.ProviceDao;
import guangjian.dao.daoImpl.ProviceDaoImpl;
import guangjian.service.ProviceService;
import redis.clients.jedis.Jedis;

import java.util.List;

public class ProviceServiceImpl implements ProviceService {
    @Override
    public String getProviceJson() {
        //这里我们用jedis方式进行缓存数据查找,如果有,则直接用,如果没有,怎继续数据库的查找
        Jedis jedis = JedisPoolUtils.getJedis();
        String pro_json=null;
       List<String> list = jedis.lrange("list", 0, -1);
        //序列化list为json
        ObjectMapper objmap = new ObjectMapper();
        try {
            pro_json = objmap.writeValueAsString(list);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        if (list==null ||list.size()==0){
            ProviceDao proviceDao =new ProviceDaoImpl();
            List list1 = proviceDao.getProviceList();
            System.out.println(list1);
            //把list1集合存入jedis中
            jedis.lpush("list",String.valueOf(list1));
            //序列化list为json
            try {
                pro_json = objmap.writeValueAsString(list1);
            } catch (JsonProcessingException e){
                e.printStackTrace();
            }
        }


        return pro_json;
    }
}
