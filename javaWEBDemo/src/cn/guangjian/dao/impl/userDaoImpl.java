package cn.guangjian.dao.impl;

import cn.guangjian.dao.*;
import cn.guangjian.domain.user;
import cn.guangjian.utils.JDBCutils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;

public class userDaoImpl implements userDao ,findAllDao,addAllDao,deleteIdDao,selectIdDao,updateAddIdDao,selectDelDao,getCountDao,getCurrentPageListDao,getUsernameCheckDao {
    JdbcTemplate tempt = new JdbcTemplate(JDBCutils.getDataSource());
    @Override
    public Object checkUserDao(user user) {
        //获取用户名和密码
        String username = user.getUsername();
        String password = user.getPassword()+"";

        try {
            String str = "select * from user where username= ? and PASSWORD = ?";
            user user1 = tempt.queryForObject(str, new BeanPropertyRowMapper<user>(user.class), username, password);
            return user1;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List findAll() {
        String str = "select * from user";
        List<user> list = tempt.query(str, new BeanPropertyRowMapper<>(user.class));
        return list;
    }

    @Override
    public void add(user user){
        String str = "insert into user values(?,?,?,?,?,?,?,?)";
        tempt.update(str,null,user.getUsername(),user.getPassword()+"",user.getGender(),user.getAge(),user.getPhoneNumber()+"",user.getAddress(),user.getDate());
    }

    @Override
    public void deleteId(int id) {
        String str = "delete from user where id = ?";
        tempt.update(str,id);
    }

    @Override
    public List<user> selectId(int id) {
        String str = "select * from user where id = ?";
        List<user> list = tempt.query(str, new BeanPropertyRowMapper<>(user.class),id);
        return list;
    }

    @Override
    public void updateAdd(user user){
        int id = user.getId();
        String str = "update user set gender=?,age=?,phoneNumber=?,address=?,date=? where id= ?";
        tempt.update(str,user.getGender(),user.getAge(),user.getPhoneNumber()+"",user.getAddress(),user.getDate(),id);
    }

    @Override
    public void selectDel(String[] ids) {
        for (String idr : ids) {
            int id = Integer.parseInt(idr);
            String str = "delete from user where id = ?";
            tempt.update(str,id);
        }
    }

    @Override
    public int getCountId(String name,String age,String address) {
        /*
        这里进行一个字符串的拼接,一共有7种情况
         空    非   非
         非    空   非
         非    非   空
         空    空   非
         空    非   空
         非    空   空
         空    空   空
         */
        //首先把获得的参数生成一个数组如果参数为空则删除
        List list = new ArrayList();
        if(name!=""&&name!=null&&name.length()>0){
            list.add("%"+name+"%");
        }
        if(age!=""&&age!=null&&age.length()>0){
            list.add("%"+age+"%");
        }
        if(address!=""&&address!=null&&address.length()>0){
            list.add("%"+address+"%");
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("select count(id) from user where 1 = 1 ");
        String sss = "";
         if(name=="" && age!="" && address!=""){
             sss = "AND  age like ? AND address  like ? ";
         }else if(name!="" && age=="" && address!=""){
             sss = "AND  uername like ? AND  address  like ? ";
        }else if(name!="" && age!="" && address==""){
             sss = "AND  username like ?  AND age  like ? ";
         }else if(name=="" && age=="" && address!=""){
             sss = "AND address like ?  ";
         }else if(name=="" && age!="" && address==""){
             sss = "AND age like ? ";
         }else if(name!="" && age=="" && address==""){
             sss = "AND username like ? ";
         }
        String str = stringBuilder.append(sss).toString();//拼接好的sql
        System.out.println("str"+str);
        System.out.println(list.toString());
        Long aLong = tempt.queryForObject(str, Long.class,list.toArray());
        int count  = aLong.intValue();
        return count;
    }

    @Override
    public List<user> getCurrentPageList(int currentPage, int rows,String name,String age,String address) {
        List list = new ArrayList();
        if(name!="" &&name!=null&&name.length()>0){
            list.add("%"+name+"%");
        }
        if(age!=""&&age!=null&&age.length()>0){
            list.add("%"+age+"%");
        }
        if(address!=""&&address!=null&&address.length()>0){
            list.add("%"+address+"%");
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("select * from user where 1 = 1 ");
        String sss = "";
        if(name=="" && age!="" && address!=""){
            sss = "AND  age like ? AND address  like ? ";
        }else if(name!="" && age=="" && address!=""){
            sss = "AND  username like ? AND  address  like ? ";
        }else if(name!="" && age!="" && address==""){
            sss = "AND  username like ?  AND age  like ? ";
        }else if(name=="" && age=="" && address!=""){
            sss = "AND address like ?  ";
        }else if(name=="" && age!="" && address==""){
            sss = "AND age like ? ";
        }else if(name!="" && age=="" && address==""){
            sss = "AND username like ? ";
        }
        String sql = stringBuilder.append(sss).append(" limit ? , ? ").toString();//拼接好的sql
        System.out.println("sql"+sql);
        System.out.println(list.toString());
        //开始数
        int begin = (currentPage-1)*rows;
        list.add(begin);
        list.add(rows);
        List<user> list1 = tempt.query(sql, new BeanPropertyRowMapper<>(user.class),list.toArray());
        return list1;
    }

    @Override
    public Boolean getUcheck(String username) {
        String sql = "select * from user where username = ?";
        Long along = tempt.queryForObject(sql, Long.class, username);
        int i = along.intValue();
        if(i>0){
            return true;
        }else{
            return false;
        }
    }
}
