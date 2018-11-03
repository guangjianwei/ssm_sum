package cn.guangjian.controller;

import cn.guangjian.domain.Orders;
import cn.guangjian.service.OrdersService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/orders")
public class OrderController{
    /**
     * 分页查询订单信息
     */
    @Autowired
    private OrdersService ordersService;
    @RequestMapping("/findAll.do")
    public ModelAndView findAll(@RequestParam(name = "page",required = true)Integer page,@RequestParam(name="size",required = true)Integer size) throws Exception {
        List<Orders> list = ordersService.findAll(page,size);
        //定义一个pageInfo,把list传入,pageinfo既是一个pageBean
        //这里是用了pageInfo中的构造函数的方式进行list导入的
        PageInfo pageInfo = new PageInfo(list);
        ModelAndView mv = new ModelAndView();
        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("orders-list");
        return mv;
    }
    @RequestMapping("/findById.do")
    public ModelAndView findById(@RequestParam(name = "id",required = true) Integer oid) throws Exception {
        Orders orders = ordersService.findById(oid);
        ModelAndView mv = new ModelAndView();
        mv.addObject("orders",orders);
        mv.setViewName("orders-show");
        return mv;
    }
}
