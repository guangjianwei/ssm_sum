package cn.guangjian.controller;
import cn.guangjian.domain.Product;
import cn.guangjian.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping("/findAll.do")
    public ModelAndView findAll() throws Exception {
        ModelAndView mv = new ModelAndView();
        List<Product> list = productService.findAll();
        mv.addObject("list",list);
        mv.setViewName("product-list");
        return mv;
    }
//    @RequestMapping("/findAll.do")
//    public String findAll(Model model){
//        List<Product> list = productService.findAll();
//        model.addAttribute("list",list);
//        return "success";
//    }
    @RequestMapping("/save.do")
    public String save(Product product) throws Exception {
       productService.save(product);
       //当保存成功后进行转发
        return "forward:findAll.do";
    }
}
