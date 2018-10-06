package com.yunjae.springaopsample;

import com.yunjae.springaopsample.aop.services.TracibleService;
import com.yunjae.springaopsample.aop.services.TracibleXmlService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringAopSampleApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SpringAopSampleApplication.class);
        ConfigurableApplicationContext ctx = app.run(args);

        ctx.getBean(TracibleService.class).hello("aop");
        ctx.getBean(TracibleXmlService.class).hello("aop-xml");
    }
}
