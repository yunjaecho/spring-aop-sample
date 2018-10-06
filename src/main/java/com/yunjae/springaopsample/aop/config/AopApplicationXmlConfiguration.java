package com.yunjae.springaopsample.aop.config;

import com.yunjae.springaopsample.aop.services.TracibleXmlService;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:aop-context.xml")
public class AopApplicationXmlConfiguration {
    public TracibleXmlService tracibleXmlService() {
        return new TracibleXmlService();
    }
}
