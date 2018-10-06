package com.yunjae.springaopsample.aop.apectj;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AopAspectjConfiguration {

    @Bean
    public ExecutionTracerApect executionTracerApect() {
        return new ExecutionTracerApect();
    }
}
