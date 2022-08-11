package cn.qingyandark.controller.advice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

// 声明bean，及aop
@Component
@Aspect
public class aop {
    // 当执行到如下方法后，执行pt()
    @Pointcut("execution(void cn.qingyandark.service.UserService.update())")
    private void pt(){}

    // 在pt()执行之前执行
    @Before("pt()")
    public void method(){
        System.out.println(System.currentTimeMillis());
    }
}
