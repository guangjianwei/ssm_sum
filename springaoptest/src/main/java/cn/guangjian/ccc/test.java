package cn.guangjian.ccc;
import cn.guangjian.bbb.Contll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class test {
    @Autowired
    private static Contll contll;
    public static void main(String[] args) {
        contll.cont();
    }
}
