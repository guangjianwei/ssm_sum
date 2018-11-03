package cn.guangjian.service.impl;

import cn.guangjian.dao.OrdersDao;
import cn.guangjian.domain.Orders;
import cn.guangjian.service.OrdersService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("ordersService")
public class OrderServiceImpl implements OrdersService {
    @Autowired
    private OrdersDao ordersDao;
    @Override
    public List<Orders> findAll(Integer page,Integer size) throws Exception {
        //获取第1页，4条内容，默认查询总数count
        PageHelper.startPage(page, size);
        List<Orders> list = ordersDao.findAll(page,size);
        return list;
    }

    @Override
    public Orders findById(Integer id) throws Exception {
        Orders order = ordersDao.findById(id);
        return order;
    }
}
