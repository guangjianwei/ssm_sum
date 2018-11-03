package 商品购物秒杀活动;

public class ShopList {
    String perName;//购物人姓名
    String perBrand;//所购买商品名称
    int perCount;//所购买商品数量
    String perAddress;  //商品产地
    double perPrice;    //商品单价

    public ShopList() {
    }

    public ShopList(String perName, String perBrand, int perCount, String perAddress, double perPrice) {
        this.perName = perName;
        this.perBrand = perBrand;
        this.perCount = perCount;
        this.perAddress = perAddress;
        this.perPrice = perPrice;
    }

    @Override
    public String toString() {
        return "ShopList{" +
                "perName='" + perName + '\'' +
                ", perBrand='" + perBrand + '\'' +
                ", perCount=" + perCount +
                ", perAddress='" + perAddress + '\'' +
                ", perPrice=" + perPrice +
                '}';
    }
}
