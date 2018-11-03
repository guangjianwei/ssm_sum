package cn.guangjian.controller;

import cn.guangjian.domain.errorMessage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/error")
public class ErrorController{
    /**
     *自定义错误
     * @return
     */
    @RequestMapping("/byZero")
    public String byZero() throws Exception{
        System.out.println("byZero方法执行了...");
        try {
            int i = 1/0;
        } catch (Exception e) {
            e.printStackTrace();
            throw new errorMessage("用户查询错误...");
        }

        return "success";
    }
}

