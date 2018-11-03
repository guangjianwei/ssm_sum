package cn.guangjian.proxy.dongtaiProxy;

public interface IProduct {
    /**
     * 售出电脑,并拿到钱
     */
    public void salePro(Float money);
    public void afterSale(Float money);
}
