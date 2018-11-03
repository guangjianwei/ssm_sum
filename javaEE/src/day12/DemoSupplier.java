package day12;

import java.util.function.Supplier;

//生产东西
public class DemoSupplier {
    public static void main(String[] args) {
       String str =  getCount(()-> "Hellow world!");
        System.out.println(str);
    }
    public static String getCount(Supplier supplier){
        return (String) supplier.get();
    }
}
