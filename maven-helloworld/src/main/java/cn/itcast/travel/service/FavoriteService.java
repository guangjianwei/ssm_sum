package cn.itcast.travel.service;

import cn.itcast.travel.domain.PageBean;

public interface FavoriteService {
    Boolean isFavorite(int uid,String rid);

    void addFavorite(int uid, String rid);

    int showFavCount(String rid);

    PageBean showFavList(String rname, String le_price, String rg_price, String currentPage);
}
