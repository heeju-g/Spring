package com.example.aop.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

//특정 메소드 실행시간
@Aspect
@Component
public class TimerAop {
    @Pointcut("execution(* com.example.aop.controller..*.*(..))")
    private void cut(){

    }
    @Pointcut("@annotation(com.example.aop.annotation.Timer)")
    private void enableTimer(){

    }
    //두 조건 같이 쓴다.
    @Around("cut() && enableTimer()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        Object result = joinPoint.proceed();
        stopWatch.stop();
        System.out.println("total time : "+stopWatch.getTotalTimeSeconds());
    }
}
