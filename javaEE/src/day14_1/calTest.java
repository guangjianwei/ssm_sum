package day14_1;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class calTest {
    @Before
    public void show1(){
        System.out.println("before");
    }
    @Test
    public void testAdd(){
        Calculator cal = new Calculator();
        System.out.println("init...");
        int result = cal.calAdd(5, 6);
        Assert.assertEquals(11,result);
    }
@After
    public void show2(){
        System.out.println("After");
    }
}
