package cn.guangjian.controller;

import cn.guangjian.domain.log.SysLog;
import cn.guangjian.service.SysLogService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.Date;

@Component
@Aspect
public class LogAop {
    @Autowired
    private SysLogService sysLogService;
    @Autowired
    private HttpServletRequest request;

    private Date startTime; // 访问时间
    private Class clazz;// 访问的类
    private Method method; // 访问的方法

    // 主要获取访问时间、访问的类、访问的方法
    @Before("execution(* cn.guangjian.controller.*.*(..))")
    public void doBefore(JoinPoint jp) throws NoSuchMethodException {
        startTime = new Date();//访问时间
        //获取访问的类
        clazz = jp.getTarget().getClass();
        //获取访问方法
        String methodName = jp.getSignature().getName();//获取访问方发名称
        Object[] args = jp.getArgs();//获取访问的方法参数
        if (args == null || args.length == 0) {//无参
            method = clazz.getMethod(methodName);//只能获取无参方法
        } else {
            //如果有参,就将args中所有元素遍历,获取对应的Class,装入到一个Class[]
            Class[] classArgs = new Class[args.length];
            for (int i = 0; i < args.length; i++) {
                classArgs[i] = args[i].getClass();
            }
            method = clazz.getMethod(methodName, classArgs);//获取去有参方法
        }
    }

    @After("execution(* cn.guangjian.controller.*.*(..))")
    public void doAfter(JoinPoint jp) {
        long time = new Date().getTime() - startTime.getTime();//获取处理时长
        String url = "";
        if (clazz != null && method != null && clazz != LogAop.class) {
            //1.獲取類上的@RequestMapping("/orders")
            RequestMapping classAnnotation = (RequestMapping) clazz.getAnnotation(RequestMapping.class);
            if (classAnnotation != null) {
                String[] classValue = classAnnotation.value();
                //2.獲取方法上的@RequestMapping(xxx)
                RequestMapping methodAnnotation = method.getAnnotation(RequestMapping.class);
                if (methodAnnotation != null) {
                    String[] methodValue = methodAnnotation.value();
                    url = classValue[0] + methodValue[0];

                }
            }
        }

        //獲取訪問的Ip
        String ip = request.getRemoteAddr();
        //可以通過securityContext獲取,也可以通過request.getSession()獲取
        SecurityContext context = SecurityContextHolder.getContext();
//        request.getSession().getAttribute("SPRING_SECURITY_CONTEXT");
        String username = ((User) (context.getAuthentication().getPrincipal())).getUsername();
        SysLog sysLog = new SysLog();
        sysLog.setUsername(username);
        sysLog.setMethod("[類名" + clazz.getName() + "[方法名]" + method.getName());
        sysLog.setIp(ip);
        sysLog.setUrl(url);
        sysLog.setVisitTime(startTime);
        sysLog.setExecutionTime(time);
        //直接添加
        sysLogService.save(sysLog);
    }
}
