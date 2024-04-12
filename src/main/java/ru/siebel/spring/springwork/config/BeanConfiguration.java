package ru.siebel.spring.springwork.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import ru.siebel.spring.springwork.service.SimpleService;

@Configuration
public class BeanConfiguration {

    @Bean(
            //initMethod = "postConstructExample",
            //destroyMethod = "preDestroyExample"
    )
    @Scope("prototype")
    public SimpleService simpleService() {
        return new SimpleService();
    }
}
