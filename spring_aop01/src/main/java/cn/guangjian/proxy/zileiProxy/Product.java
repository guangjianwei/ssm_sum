package cn.guangjian.proxy.zileiProxy;

public class Product {
    /**
     * 售前
     *
     * @param money
     */
    public void salePro(Float money) {
        System.out.println("销售产品，售价:" + money + "元");
    }

    public void afterSale(Float money) {
        System.out.println("售后服务，服务价格:" + money + "元");
    }
}
