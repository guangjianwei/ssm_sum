package cn.guangjian.service;


import cn.guangjian.domain.Account;

public interface AccountService {
    /**
     * 向account表中添加数据
     * @param
     */
    void insert(Account account);
    /**
     * 删除数据
     * @param
     */
    void delete(Integer integer);
    /**
     *修改数据
     * @param
     */
    void update(Account account);
    /**
     * 查找数据
     * @param
     */
    Account findOne(Integer integer);
}
