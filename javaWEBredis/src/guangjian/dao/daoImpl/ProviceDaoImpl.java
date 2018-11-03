package guangjian.dao.daoImpl;

import com.alibaba.druid.util.JdbcUtils;
import guangjian.dao.ProviceDao;
import guangjian.domain.Provice;
import guangjian.utils.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class ProviceDaoImpl implements ProviceDao{
    JdbcTemplate tempt  = new JdbcTemplate(JDBCUtils.getDataSource());
    @Override
    public List getProviceList() {
        //获取数据库中省份列表的集合
        String sql = "SELECT * FROM provice";
        List<Provice> list = tempt.query(sql, new BeanPropertyRowMapper<>(Provice.class));
        return list;
    }
}
