package cn.itcast.travel.service.impl;
import cn.itcast.travel.dao.FavoriteDao;
import cn.itcast.travel.dao.impl.FavoriteDaoImpl;
import cn.itcast.travel.domain.Favorite;
import cn.itcast.travel.domain.PageBean;
import cn.itcast.travel.domain.Route;
import cn.itcast.travel.service.FavoriteService;

import java.util.List;

public class FavoriteServiceImpl implements FavoriteService {
    @Override
    public Boolean isFavorite(int uid, String rid) {
        FavoriteDao favoriteDao =new FavoriteDaoImpl();
        Favorite favorite = favoriteDao.isFavorite(uid, Integer.parseInt(rid));
        if(favorite==null||favorite.toString().length()==0){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public void addFavorite(int uid, String rid) {
        FavoriteDao favoriteDao =new FavoriteDaoImpl();
      favoriteDao.addFavorite(uid, Integer.parseInt(rid));
    }

    @Override
    public int showFavCount(String rid) {
        FavoriteDao favoriteDao = new FavoriteDaoImpl();
        int favCount  = favoriteDao.showFavCount(rid);
        //获取到favCount后,把数据库中的数据更改一下
        favoriteDao.addCount(rid,favCount);

        return favCount;

    }

    @Override
    public PageBean showFavList(String rname, String le_price, String rg_price, String currentPage) {
        //自定义每页显示8个数据
        int pageSize = 8;
        //首先获取页码的总数
        FavoriteDao favoriteDao = new FavoriteDaoImpl();
        int totalCount =favoriteDao.getFavCount(rname,Integer.parseInt(le_price),Integer.parseInt(rg_price));
        int totalPage = totalCount%pageSize==0?totalCount/pageSize:(totalCount/pageSize+1);
        //计算出开始条数
        int start = (Integer.parseInt(currentPage)-1)*pageSize;
        //获取Route的list集合
       List<Route> pageList=favoriteDao.getFavPage(rname,Integer.parseInt(le_price),Integer.parseInt(rg_price),start,pageSize);
       //把以上数据封装到PageBean
        PageBean page = new PageBean();
        page.setList(pageList);
        page.setTotalPage(totalPage);
        page.setTotalCount(totalCount);
        page.setCurrentPage(Integer.parseInt(currentPage));
        return page;
    }
}
