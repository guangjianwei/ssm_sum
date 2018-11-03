package 商品购物秒杀活动;
/*
Person类：用户信息描述，包含字段（用户名称（String name）,用户联系方式（String tel），
用户配送地址（String address）,购买商品是否需要配送（boolean dis））
 */
public class Person {
   private String name;   //用户名称
   private String tel;   //用户联系方式
   private String address;  //用户配送地址
   private boolean dis;  //购买商品是否需要配送

    public Person() {
    }

    public Person(String name, String tel, String address, boolean dis) {

        this.name = name;
        this.tel = tel;
        this.address = address;
        this.dis = dis;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isDis() {
        return dis;
    }

    public void setDis(boolean dis) {
        this.dis = dis;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                ", address='" + address + '\'' +
                ", dis=" + dis +
                '}';
    }
}
