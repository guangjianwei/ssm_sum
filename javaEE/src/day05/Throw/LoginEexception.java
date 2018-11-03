
package day05.Throw;
//这里创建一个自定义异常类
public class LoginEexception extends Exception{
    public LoginEexception(){

    }
    public LoginEexception(String message){
       super(message);
    }
}
