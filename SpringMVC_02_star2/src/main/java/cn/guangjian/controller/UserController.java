package cn.guangjian.controller;

import cn.guangjian.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Date;

@Controller
@RequestMapping("/user")
public class UserController {
    /**
     * 返回值是String类型
     * @param model
     * @return
     */
    @RequestMapping("/string")
    public String testString(Model model){
        System.out.println("testString方法执行了...");
        User user =new User();
        user.setPsw(123);
        user.setUname("rose");
        user.setDate(new Date());
        model.addAttribute("user",user);
        return "success";
    }
    /**
     * 返回值是void类型，使用request的请求转发
     */
    @RequestMapping("/desparcher")
    public void testDesparcher(Model model, HttpServletRequest request, HttpServletResponse response){
        System.out.println("testDesparcher方法执行了...");
        User user =new User();
        user.setPsw(456);
        user.setUname("ming");
        user.setDate(new Date());
        model.addAttribute("user",user);
        //请求转发
        try {
            request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * 返回值是void类型，使用request的重定向
     * @param request
     * @param response
     */
    @RequestMapping("/redirect")
    public void testRedirect(HttpServletRequest request, HttpServletResponse response){
        System.out.println("testRedirect方法执行了...");
        User user =new User();
        user.setPsw(111);
        user.setUname("jeck");
        user.setDate(new Date());
        HttpSession session = request.getSession();
        session.setAttribute("user",user);
        //重定向
        try {
            response.sendRedirect(request.getContextPath()+"/index.jsp");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 使用ModelAndView对象方式进行页面或是请求的跳转
     * @param mv
     * @return
     */
    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView(ModelAndView mv) {
        System.out.println("testModelAndView方法执行了...");
        User user = new User();
        user.setPsw(222);
        user.setUname("xuli");
        user.setDate(new Date());
        //把user对象存储到mv对象中，modelAndView对象会把user对象存储到resquest对象
        mv.addObject("user", user);
        //跳转页面
        mv.setViewName("success");
        return mv;
    }

    /**
     * 使用关键字来跳转页面,或是转发请求
     * @param request
     * @return
     */
    @RequestMapping("/testForwardOrRedirect")
    public String testForwordOrRedirect(HttpServletRequest request) {
        System.out.println("testForwordOrRedirect方法执行了...");
        //请求转发(这种方法不能经过视图解析器来进行跳转了,需要我们自己把具体的相对路径进行写好)
//        return "forward:/WEB-INF/pages/success.jsp";
        //重定向方式(这种方式不需要我们添加项目名称,spring会自动帮我们添加)
        return "redirect:/index.jsp";
    }

    /**
     * 使用@RequestBody获取请求体数据,使用@ResponseBody响应数据
     * @param body
     * @return
     */
    @RequestMapping("/testJsonStatic")
    public @ResponseBody String testJsonStatic(@RequestBody String body) {
        System.out.println("testJsonStatic方法执行了...");
        System.out.println(body);
        return body;
    }
    /**
     * 使用@ResponseBody注解把JavaBean对象转换成json字符串，直接响应
     * @param
     * @return
     */
    @RequestMapping("/testJsonStatic1")
    public @ResponseBody User testJsonStatic1(@RequestBody User user) {
        System.out.println("testJsonStatic1方法执行了...");
        user.setDate(new Date());
        return user;
    }
}
