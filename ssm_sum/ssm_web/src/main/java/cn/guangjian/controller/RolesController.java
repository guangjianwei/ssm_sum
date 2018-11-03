package cn.guangjian.controller;

import cn.guangjian.domain.user.Permission;
import cn.guangjian.domain.user.Role;
import cn.guangjian.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
@Controller
@RequestMapping("/role")
public class RolesController {
    @Autowired
    private RoleService roleService;

    /**
     * 查询所有角色
     * @return
     * @throws Exception
     */
    @RequestMapping("/findAll.do")
    public ModelAndView findAll() throws Exception {
        ModelAndView mv = new ModelAndView();
        List<Role> roleList = roleService.findAll();
        mv.addObject("roleList",roleList);
        mv.setViewName("role-list");
        return mv;
    }

    /**
     * 添加角色
     * @param role
     * @return
     * @throws Exception
     */
    @RequestMapping("/save.do")
    public String save(Role role) throws Exception{
        roleService.save(role);
        return "redirect:findAll.do";
    }

    /**
     * 查找角色和可以添加的权限
     * @return
     */
    @RequestMapping("/findRoleByIdAndAllPermission.do")
    public ModelAndView findRoleByIdAndAllPermission(Integer id){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("role-permission-add");
        //获取id对应的角色信息
       Role role =  roleService.findById(id);
       //获取角色对应的可添加权限List
      List<Permission> permissionList = roleService.findOtherPermissionByRoleId(id);
         mv.addObject("role",role);
         mv.addObject("permissionList",permissionList);
         return mv;
    }
    /**
     * 为角色添加选中的权限
     * @param roleId
     * @param ids
     * @return
     */
    @RequestMapping("/addPermissionToRole.do")
    public String addPermissionToRole(@RequestParam(name = "roleId",required = true) Integer roleId,@RequestParam(name = "ids",required = true) String[] ids){
        roleService.addPermissionToRole(roleId,ids);
        return "redirect:findAll.do";
    }

    /**
     * 根据id查询角色信息
     * @param id
     * @return
     */
    @RequestMapping("/findById.do")
    public ModelAndView findById(Integer id){
        Role role = roleService.findById(id);
        ModelAndView mv = new ModelAndView();
        mv.addObject("role",role);
        mv.setViewName("role-show");
        return mv;
    }
}
