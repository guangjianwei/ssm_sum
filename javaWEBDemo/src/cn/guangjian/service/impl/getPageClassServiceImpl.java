package cn.guangjian.service.impl;

import cn.guangjian.dao.getCountDao;
import cn.guangjian.dao.getCurrentPageListDao;
import cn.guangjian.dao.impl.userDaoImpl;
import cn.guangjian.domain.Page;
import cn.guangjian.domain.user;
import cn.guangjian.service.getPageClassService;

import java.util.List;

public class getPageClassServiceImpl implements getPageClassService {
    /**
     * 查询所有数据的指定页面数据并返回
     * @param currentPage
     * @return
     */
    @Override
    public Page getPageClass(int currentPage,String name,String age,String address) {
        int totalCount = 0;//总记录数
        int totalPage = 0;//总页码
        List<user> pagelist = null;//每页的数据
        int rows = 6;//每页显示的条数
        //1.首先获取总的记录数,就是查询数据库中有多少数据
        getCountDao gcd = new userDaoImpl();
        totalCount  = gcd.getCountId(name,age,address);//获取到总的记录数
        //计算出总页码
        if(totalCount%rows==0){
            totalPage=totalCount/rows;//总页码数
        }else{
            totalPage=totalCount/rows + 1;
        }
        getCurrentPageListDao gcpd = new userDaoImpl();
        pagelist = gcpd.getCurrentPageList(currentPage, rows,name,age,address);//获取到每页的数据
        //把获取到的数据全部封装到Page中
        Page page = new Page();
        page.setCurrentPage(currentPage);
        page.setList(pagelist);
        page.setRows(rows);
        page.setTotalCount(totalCount);
        page.setTotalPage(totalPage);
        return page;//返回page对象
    }
}
