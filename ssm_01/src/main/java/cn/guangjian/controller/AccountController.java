package cn.guangjian.controller;

import cn.guangjian.domain.Account;
import cn.guangjian.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController{
    @Autowired
    private AccountService accountService;
    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("控制器中的findAll方法执行了...");
        List<Account> list = accountService.findAll();
        //添加到request域中
        model.addAttribute("list", list);
        return "success";
    }
    @RequestMapping("/save")
    public String save(Account account){
        System.out.println("控制器中的save方法执行了...");
        accountService.save(account);
        return "success";
    }

}
