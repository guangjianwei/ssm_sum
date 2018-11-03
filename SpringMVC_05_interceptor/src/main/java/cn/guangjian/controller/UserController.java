package cn.guangjian.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/testOne")
    public String testOne(){
        System.out.println("testOne方法执行了...");
        return "success";
    }
    @RequestMapping("/testTwo")
    public String testTwo(){
        System.out.println("testTwo方法执行了...");
        return "success";
    }
    @RequestMapping("/testThree")
    public String testThree(){
        System.out.println("testThree方法执行了...");
        return "success";
    }
}
