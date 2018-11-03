package cn.itcast.travel.dao;

import cn.itcast.travel.domain.Favorite;
import cn.itcast.travel.domain.Route;

import java.util.List;

public interface FavoriteDao {
    Favorite isFavorite(int uid , int rid);

    void addFavorite(int uid, int rid);

    int showFavCount(String rid);

    void addCount(String rid, int favCount);

    int getFavCount(String rname, int le_price, int rg_price);

    List<Route> getFavPage(String rname, int le_price, int rg_price, int start, int pageSize);
}
