package cn.guangjian.controller;
import cn.guangjian.domain.User;
import cn.guangjian.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/findAll")
    public String  findAll(Model model){
        System.out.println("控制器中的findAll方法执行了...");
        List<User> list = userService.findAll();
        model.addAttribute("list",list);
        return "success";
    }
    @RequestMapping("/insert")
    public void   insert(User user,HttpServletRequest request,HttpServletResponse response) {
        System.out.println("控制器中的insert方法执行了...");
        userService.insert(user);
//        进行一次重定向
        try {
            response.sendRedirect(request.getContextPath()+"/user/findAll");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return;
    }
}
