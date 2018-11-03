package cn.itcast.travel.dao;

import cn.itcast.travel.domain.Route;

import java.util.List;

public interface RouteDao {
    int getCountPage(int cid,String rname);
    List<Route> getPageList(int pageSize,int start,int cid,String rname);
    Route getOne(int rid);
}
