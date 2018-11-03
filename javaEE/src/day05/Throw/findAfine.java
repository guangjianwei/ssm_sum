package day05.Throw;

import javax.security.auth.login.FailedLoginException;

public class findAfine {
    public static void main(String[] args) throws FailedLoginException {
        find("b.txt");
    }

    private static void find(String a) throws FailedLoginException {
        if(!a.equals("a.txt")){
            throw new FailedLoginException("没有相应的文件！");
        }
    }
}
