package cn.guangjian.dao;

import java.util.List;

public interface getCurrentPageListDao<T> {
    //currentPage,rows
    List<T> getCurrentPageList(int currentPage, int rows,String name,String age,String address);
}
