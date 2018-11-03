package com.product;

import java.util.Date;
public class pruduct {
   private Integer pid;  //id
   private String pname;//名称
   private Integer market_price;//商场价
   private Integer shop_price;//商城价
   private String pimage;//图片路径
   private Date pdate;//上架时间
   private Integer is_hot;//是否热门:0=不热门,1=热门
   private String pdesc;//商品描述
   private Integer pfalg;//商品标记:0=未下架(默认),1=已经下架
   private Integer cid;//商品类别

    public pruduct() {
    }

    public pruduct(Integer pid, String pname, Integer market_price, Integer shop_price, String pimage, Date pdate, Integer is_hot, String pdesc, Integer pfalg, Integer cid) {

        this.pid = pid;
        this.pname = pname;
        this.market_price = market_price;
        this.shop_price = shop_price;
        this.pimage = pimage;
        this.pdate = pdate;
        this.is_hot = is_hot;
        this.pdesc = pdesc;
        this.pfalg = pfalg;
        this.cid = cid;
    }

    public Integer getPid() {

        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Integer getMarket_price() {
        return market_price;
    }

    public void setMarket_price(Integer market_price) {
        this.market_price = market_price;
    }

    public Integer getShop_price() {
        return shop_price;
    }

    public void setShop_price(Integer shop_price) {
        this.shop_price = shop_price;
    }

    public String getPimage() {
        return pimage;
    }

    public void setPimage(String pimage) {
        this.pimage = pimage;
    }

    public Date getPdate() {
        return pdate;
    }

    public void setPdate(Date pdate) {
        this.pdate = pdate;
    }

    public Integer getIs_hot() {
        return is_hot;
    }

    public void setIs_hot(Integer is_hot) {
        this.is_hot = is_hot;
    }

    public String getPdesc() {
        return pdesc;
    }

    public void setPdesc(String pdesc) {
        this.pdesc = pdesc;
    }

    public Integer getPfalg() {
        return pfalg;
    }

    public void setPfalg(Integer pfalg) {
        this.pfalg = pfalg;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    @Override
    public String toString() {
        return "pruduct{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", market_price=" + market_price +
                ", shop_price=" + shop_price +
                ", pimage='" + pimage + '\'' +
                ", pdate=" + pdate +
                ", is_hot=" + is_hot +
                ", pdesc='" + pdesc + '\'' +
                ", pfalg=" + pfalg +
                ", cid=" + cid +
                '}';
    }
}
