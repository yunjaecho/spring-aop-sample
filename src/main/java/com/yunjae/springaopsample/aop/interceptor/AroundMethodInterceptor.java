package com.yunjae.springaopsample.aop.interceptor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.util.Arrays;

public class AroundMethodInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        Object[] args = methodInvocation.getArguments();
        String signature = methodInvocation.getMethod().toString();

        Object result = methodInvocation.proceed();
        System.out.println("=== \n Method " + signature  + "' was called with next arguments + " + Arrays.toString(args) + "\n====");
        return result;
    }
}
