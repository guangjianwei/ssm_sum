package cn.guangjian.controller;

import cn.guangjian.domain.user.Role;
import cn.guangjian.domain.user.UserInfo;
import cn.guangjian.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    /**
     * 查询所有用户信息
     */
    @RequestMapping("/findAll.do")
    public ModelAndView findAll() throws Exception {
        ModelAndView mv = new ModelAndView();
        List<UserInfo> userList = userService.findAll();
        mv.addObject("userList",userList);
        mv.setViewName("user-list");
        return mv;
    }

    /**
     * 添加用户
     * @param userInfo
     * @return
     */
    @RequestMapping("/save.do")
    public String save(UserInfo userInfo) throws Exception {
        userService.save(userInfo);
        return "redirect:findAll.do";
    }

    /**
     * 查询用户详情
     * @return
     * @throws Exception
     */
    @RequestMapping("/findById.do")
    public ModelAndView findById(Integer id) throws Exception{
        ModelAndView mv = new ModelAndView();
        UserInfo user = userService.findById(id);
        mv.addObject("user",user);
        mv.setViewName("user-show");
        return mv;
    }

    /**
     *根据id查询用户信息，以及所有角色中所有非用户所拥有角色的List集合
     * @return
     */
    @RequestMapping("/findUserByIdAndAllRole.do")
    public ModelAndView findUserByIdAndAllRole(Integer id) throws Exception {
        ModelAndView mv  = new ModelAndView();
        //首先查找用户信息
        UserInfo user = userService.findById(id);
        //再查找所有角色中非用户角色信息
       List<Role> role  =  userService.findByIdOtherRoles(id);
        mv.addObject("user",user);
        mv.addObject("roleList",role);
        mv.setViewName("user-role-add");
        return mv;
    }
    @RequestMapping("/addRoleToUser.do")
    public String addRoleToUser(@RequestParam(name = "userId",required = true) Integer id, @RequestParam(name = "ids",required = true) String[] ids){
        userService.addRoleToUser(id,ids);
        return "redirect:findAll.do";
    }
}
