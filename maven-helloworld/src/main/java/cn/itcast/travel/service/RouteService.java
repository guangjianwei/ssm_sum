package cn.itcast.travel.service;

public interface RouteService {
    String getRountPage(String currentPage,String pageSize,String cid ,String rname);
    String getRouteOne(int rid);
}
