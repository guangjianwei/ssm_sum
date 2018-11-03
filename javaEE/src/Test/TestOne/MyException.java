package Test.TestOne;

public class MyException extends RuntimeException {
    //如果年龄为负数则抛出异常
    public MyException(){
        super();
    }
    public MyException(String s){
        super(s);
    }
}
