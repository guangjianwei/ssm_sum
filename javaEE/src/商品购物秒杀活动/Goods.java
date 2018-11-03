package 商品购物秒杀活动;
/*
Goods类：秒杀商品信息的，包含字段有(商品品牌(String brand)，商品数量（int num）,
商品产地（String address），商品单价（double  price）)
 */
public class Goods {
    String brand;   //商品品牌
    int num;         //商品数量
    String dddress;  //商品产地
    double prece;    //商品单价

    public Goods() {
    }

    public Goods(String brand, int num, String dddress, double prece) {
        this.brand = brand;
        this.num = num;
        this.dddress = dddress;
        this.prece = prece;
    }
}
