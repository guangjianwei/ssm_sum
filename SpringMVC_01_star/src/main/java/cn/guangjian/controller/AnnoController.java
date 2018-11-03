package cn.guangjian.controller;
import cn.guangjian.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import java.util.Date;
import java.util.Map;

@Controller
@RequestMapping("/anno")
@SessionAttributes(value={"msg"})
public class AnnoController{
    @RequestMapping("/requestParam")
    public String reqParam(@RequestParam(name="uname") String username){
        System.out.println(username);
        return "success";
    }
    @RequestMapping("/requestBody")
    public String reqBody(@RequestBody String body){
        System.out.println(body);
        return "success";
    }
    @RequestMapping("/pathVariable/{sid}")
    public String pathVariable(@PathVariable(name="sid") String id){
        System.out.println(id);
        return "success";
    }
    @RequestMapping("/modelAttribute")
    public String modelAttribute(@ModelAttribute("abc") User user){
        System.out.println(user.toString());
        return "success";
    }
//    @ModelAttribute
//    public User showModel(User user){
//        System.out.println("执行了showModel方法："+user.toString());
//        Date date = new Date();
//        user.setDate(date);
//        return user;
//    }
@ModelAttribute
public void showModel(String uname,Map<String,User> map){
    System.out.println("showModel方法执行了...");
    Date date = new Date();
    User user =new User();
    user.setUname(uname);
    user.setPsw(123);
    user.setDate(date);
    map.put("abc",user);
}
    @RequestMapping("/testSessionAttribute")
    public String testSessionAttribute(Model model){
        //model底层会把这个msg存储到request狱中
        model.addAttribute("msg","妹妹...");
        return "success";
    }
    @RequestMapping("/getSessionAttribute")
    public String getSessionAttribute(ModelMap model){
        //取出request域中的数据
        Object msg = model.get("msg");
        System.out.println(msg);
        return "success";
    }
}
