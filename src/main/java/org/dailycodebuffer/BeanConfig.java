package org.dailycodebuffer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.dailycodebuffer")
public class BeanConfig {

    // in prototype example - tried by commenting the following bean
//    @Bean
//    public Doctor doctor(){
//        return new Doctor();
//    }
}
