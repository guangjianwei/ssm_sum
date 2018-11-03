package cn.itcast.travel.service.impl;

import cn.itcast.travel.dao.RouteDao;
import cn.itcast.travel.dao.RouteImageDao;
import cn.itcast.travel.dao.SellerDao;
import cn.itcast.travel.dao.impl.RouteDaoImpl;
import cn.itcast.travel.dao.impl.RouteImageDaoImpl;
import cn.itcast.travel.dao.impl.SellerDaoImpl;
import cn.itcast.travel.domain.PageBean;
import cn.itcast.travel.domain.Route;
import cn.itcast.travel.domain.RouteImg;
import cn.itcast.travel.domain.Seller;
import cn.itcast.travel.service.RouteService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class RouteServiceImpl implements RouteService{

    @Override
    public String getRountPage(String currentPage, String pageSize, String cid,String rname) {
        PageBean page  = new PageBean();
        //首先获得总条目
        int pageSize1 = Integer.parseInt(pageSize);
        RouteDao routeDao = new RouteDaoImpl();
        int totalCount =routeDao.getCountPage(Integer.parseInt(cid),rname);
        //计算开始条目
        int start = (Integer.parseInt(currentPage)-1)*pageSize1;
        //计算总页数
        //获取pageList
        List<Route> pageList = routeDao.getPageList(pageSize1, start, Integer.parseInt(cid),rname);
        int totalPage = totalCount%pageSize1==0?totalCount/pageSize1:(totalCount/pageSize1+1);
        page.setTotalCount(totalCount);
        page.setPageSize(pageSize1);
        page.setCurrentPage(Integer.parseInt(currentPage));
        page.setTotalPage(totalPage);
        page.setList(pageList);
        ObjectMapper obj = new ObjectMapper();
        String s="";
        try {
            s = obj.writeValueAsString(page);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return s;
    }

    @Override
    public String getRouteOne(int rid) {
        //首先根据rid查询Route
        RouteDao route = new  RouteDaoImpl();
        Route route_res = route.getOne(rid);
        //再根据rid查询ImgesList
        RouteImageDao routeImageDao = new RouteImageDaoImpl();
        List<RouteImg> images = routeImageDao.getImages(rid);
        route_res.setRouteImgList(images);
        //再依据Route中的sid查询Seller
        SellerDao sellerDao = new SellerDaoImpl();
        Seller seller = sellerDao.getSeller(route_res.getSid());
        route_res.setSeller(seller);
        ObjectMapper obj = new ObjectMapper();
        String json = "";
        try {
           json = obj.writeValueAsString(route_res);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return json;
    }
}
