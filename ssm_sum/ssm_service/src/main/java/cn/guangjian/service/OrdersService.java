package cn.guangjian.service;

import cn.guangjian.domain.Orders;

import java.util.List;
public interface OrdersService {
    List<Orders> findAll(Integer page,Integer size) throws Exception;
    Orders findById(Integer id) throws Exception;
}
