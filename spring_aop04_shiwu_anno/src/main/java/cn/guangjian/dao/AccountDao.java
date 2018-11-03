package cn.guangjian.dao;

import cn.guangjian.domain.Account;

public interface AccountDao {
    /**
     * 向account表中添加数据
     * @param account
     */
    void insert(Account account);
    /**
     * 删除数据
     * @param
     */
    void delete(Integer i);
    /**
     *修改数据
     * @param
     */
    void update(Account account);
    /**
     * 查找数据
     * @param
     */
    Account findOne(Integer i);
    /**
     * 根据姓名查找数据
     * @param
     */
    Account findOneName(String name);
}
