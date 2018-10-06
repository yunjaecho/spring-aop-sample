package com.yunjae.springaopsample.aop.config;

import com.yunjae.springaopsample.aop.services.TracibleService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AopApplicationConfiguration {

    @Bean
    public TracibleService tracibleService() {
        return new TracibleService();
    }
}
