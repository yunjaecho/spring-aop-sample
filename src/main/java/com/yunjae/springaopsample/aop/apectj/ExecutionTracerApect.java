package com.yunjae.springaopsample.aop.apectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import java.util.Arrays;

@Aspect
public class ExecutionTracerApect {

    /**
     * pointcut annotation method
     */
    //@Pointcut("execution(* com.yunjae.springaopsample.aop.services.*.*(..))")
    @Pointcut("execution(* com.yunjae.springaopsample.aop.services.TracibleService.*(..))")
    private void allMethods() { }
    /**
     * Advice after
     * @param pjp
     * @return
     * @throws Throwable
     */
    @Around("allMethods()")
    public Object trace(ProceedingJoinPoint pjp) throws Throwable {
        Object[] args = pjp.getArgs();
        String sinature = pjp.getSignature().toShortString();
        Object retVal = pjp.proceed(args);
        System.out.println("Method '" + sinature + "' was called with next argumnets " + Arrays.toString(args));
        return retVal;
    }













}
