
package cn.itcast.day06.demo01;

import cm.Phone;

public class PhoneReturn {
    public static void main(String[] args) {
        Phone two = getPhone();
        System.out.println(two.brand + "," + two.getColor());
    }

    public static Phone getPhone() {
        Phone one = new Phone();
        one.brand = "苹果";
        one.setColor("红色");
        one.price = 8998.8;
        return one;
    }
}
