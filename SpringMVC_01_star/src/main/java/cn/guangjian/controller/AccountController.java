package cn.guangjian.controller;

import cn.guangjian.domain.Account;
import cn.guangjian.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/account")
public class AccountController {

    @RequestMapping("/getOne")
    public String getOne(){
        System.out.println("武林高手之间的对决!");
        return "success";
    }

    /**
     * 前后参数类型和名称一致
     * @param username
     * @param password
     * @return
     */
    @RequestMapping("/args1")
    public String args1(String username ,Integer password){
        System.out.println("用户名:"+username+",密码:"+password);
        return "success";
    }

    /**
     * 参数和要封装的类是一致的
     * @param user
     * @return
     */
    @RequestMapping("/args2")
    public String args2(User user){
        System.out.println(user.toString());
        return "success";
    }
    /**
     * 参数名称不一致
     * @param
     * @return
     */
    @RequestMapping("/args3")
    public String args3(@RequestParam("uname") String username , @RequestParam("psw")Integer password){
        System.out.println("用户名:"+username+",密码:"+password);
        return "success";
    }
    /**
     * 参数中有另一个类的存在
     * @param
     * @return
     */
    @RequestMapping(value = "/args4",method={RequestMethod.POST})
    public String args4(Account account){
        System.out.println(account.toString());
        return "success";
    }

    /**
     * 配置自定义的String类型装换成Date（spring中只定义了yyyy/MM/dd转换称Date，没有定义其他String类型装换。）
     * @param user
     * @return
     */
    @RequestMapping(value = "/args5")
    public String args5(User user){
        System.out.println(user.toString());
        return "success";
    }

    /**
     * 获取Servlet原生的API
     * @return
     */
    @RequestMapping(value = "/args6")
    public String args6(HttpServletRequest request, HttpServletResponse response){
        System.out.println("request对象:"+request);
        System.out.println("response对象:"+response);
        System.out.println("session对象:"+request.getSession());
        System.out.println("servletContext对象:"+request.getSession().getServletContext());
        return "success";
    }
}
