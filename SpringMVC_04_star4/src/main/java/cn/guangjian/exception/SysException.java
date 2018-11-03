package cn.guangjian.exception;

import cn.guangjian.domain.errorMessage;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SysException implements HandlerExceptionResolver {
    /**
     * 处理异常业务逻辑
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o
     * @param
     * @return
     */
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception ex) {
        //这里的ex就是我们在throw new errorMessage这个对象
        //获取到异常对象
        errorMessage err = null;
        if(ex instanceof errorMessage){
            err = (errorMessage)ex;
        }else{
            err = new errorMessage("系统维护中...");
        }
        //把异常信息记录到request域中进行传递
        ModelAndView mv = new ModelAndView();
        mv.addObject("error",err.getErrorMag());
        mv.setViewName("error");
        return mv;
    }
}
