package cn.itcast.travel.web.servlet;

import cn.itcast.travel.domain.PageBean;
import cn.itcast.travel.domain.User;
import cn.itcast.travel.service.FavoriteService;
import cn.itcast.travel.service.RouteService;
import cn.itcast.travel.service.impl.FavoriteServiceImpl;
import cn.itcast.travel.service.impl.RouteServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/route/*")
public class RouteServlet extends BaseServlet {
    /**
     * 展示符合条件的所有旅游线路
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void showList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        private int currentPage;//当前页码
        String currentPage = request.getParameter("currentPage");
//        private int pageSize;//每页显示的条数
        String pageSize = request.getParameter("pageSize");
        //获取cid
        String cid = request.getParameter("cid");
        //接受搜索框中的rname
        String rname = request.getParameter("rname");
//        rname = new String(rname.getBytes("iso-8859-1"),"utf-8");
        if (rname==null||rname.length()==0||rname.equals("null")){
            rname="0";

        }
        //对这些数据进行封装判断
        if(currentPage==null||currentPage.length()==0){
            currentPage="1";
        }
        if(pageSize==null||pageSize.length()==0){
            pageSize="5";
            }
        if(cid==null||cid.length()==0||"null".equals(cid)){
            cid="0";
            }
        RouteService route = new RouteServiceImpl();
      String json=  route.getRountPage(currentPage,pageSize,cid,rname);
      response.setContentType("application/json;charset=utf-8");
      response.getWriter().write(json);
    }

    /**
     * 展示单个路由线路的信息详情
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void showOne(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //接收rid
        request.setCharacterEncoding("utf-8");
        String rid = request.getParameter("rid");
        RouteService routeService = new RouteServiceImpl();
        String routeOne = routeService.getRouteOne(Integer.parseInt(rid));
        response.setContentType("application/json;charset=utf-8");
        response.getWriter().write(routeOne);
    }

    /**
     * 查询用户是否收藏，有返回true，没有返回false
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void isFavorite(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //首先检测用户是否登陆
        request.setCharacterEncoding("utf-8");
        User user = (User)request.getSession().getAttribute("user");
        int uid = 0;
        if (user==null||user.toString().length()==0){
            return;//直接返回
        }else{
            uid = user.getUid();
        }
        String rid = request.getParameter("rid");
        FavoriteService favoriteService = new FavoriteServiceImpl();
        Boolean flag = favoriteService.isFavorite(uid, rid);
        String json = "{\"flag\":"+flag+"}";
        response.getWriter().write(json);


    }
    protected void addFavorite(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //首先检测用户是否登陆
        request.setCharacterEncoding("utf-8");
        User user = (User)request.getSession().getAttribute("user");
        Boolean flag = false;
        int uid = 0;
        if (user==null||user.toString().length()==0){
            flag=false;//直接返回
        }else{
            uid = user.getUid();
            flag=true;
        }
        String rid = request.getParameter("rid");
        //添加
        FavoriteService favoriteService = new FavoriteServiceImpl();
        favoriteService.addFavorite(uid,rid);
        //返回flag用于判断用户是否登陆；
        String json = "{\"flag\":\""+flag+"\"}";
        response.getWriter().write(json);
    }
    protected void showFavCount(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String rid = request.getParameter("rid");
        FavoriteService favoriteService = new FavoriteServiceImpl();
       int countFav =  favoriteService.showFavCount(rid);
        String json = "{\"favCount\":\""+countFav+"\"}";
        response.getWriter().write(json);

    }
    protected void showFavoriteList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          //获取搜索框中的前端的三个参数
        request.setCharacterEncoding("utf-8");
        String rname = request.getParameter("rname");
        if(rname==null||rname.length()==0||rname=="null"){
            rname="";
        }
        String le_price = request.getParameter("le_price");
        if(le_price==null||le_price.length()==0||le_price=="null"){
            le_price="0";
        }
        String rg_price = request.getParameter("rg_price");
        if(rg_price==null||rg_price.length()==0||rg_price=="null"){
            rg_price="0";
        }
        //获取分页的参数
        //当前页码
        String currentPage = request.getParameter("currentPage");
        //对当前页码进行判断
        if(currentPage==""||currentPage==null||currentPage=="null"){
            currentPage="1";
        }
        FavoriteService favoriteService = new FavoriteServiceImpl();
       PageBean page = favoriteService.showFavList(rname,le_price,rg_price,currentPage);
       //封装page
        ObjectMapper obj = new ObjectMapper();
        String json = obj.writeValueAsString(page);
        response.setContentType("application/json;charset=utf-8");
        response.getWriter().write(json);
    }
    }


