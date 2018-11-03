package cn.guangjian.aaa;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class aop {
    @Before("execution(* cn.guangjian.bbb.*.*(..))")
    public void doBefore(){
        System.out.println("doBefore方法执行了...");
    }
    @After("execution(* cn.guangjian.bbb.*.*(..))")
    public void doAfter(){
        System.out.println("doAfter方法执行了...");
    }
}
