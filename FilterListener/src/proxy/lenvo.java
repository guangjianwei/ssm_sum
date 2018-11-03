package proxy;

public class lenvo implements SaleComputer {

    @Override
    public String saleComputer(double money) {
        System.out.println("花费了"+money+"元,卖了一个电脑");
        return "联想电脑";
    }
}
