package com.example.aop.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
public class ParameterAop {
    @Pointcut("execution(* com.example.aop.controller..*.*(..))")
    private void cut(){

    }
    //cut메소드가 실행되기 전에
    @Before("cut()")
    public void before(JoinPoint joinPoint){
        //메소드에 들어가는 매개변수들의 배열
        Object[] args = joinPoint.getArgs();
        //메소드이름
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        System.out.println(method.getName());

        for(Object obj : args){
            System.out.println("type: "+obj.getClass().getSimpleName());
            System.out.println("value: "+obj);
        }
    }
    @AfterReturning(value = "cut()",returning = "returnObj")
    public void afterReturn(JoinPoint joinPoint, Object returnObj){
        System.out.println("returnObj");
        System.out.println(returnObj);
    }
}
