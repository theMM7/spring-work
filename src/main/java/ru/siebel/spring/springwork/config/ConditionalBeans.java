package ru.siebel.spring.springwork.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import ru.siebel.spring.springwork.service.ConditionalService;
import ru.siebel.spring.springwork.service.OnlyProdService;
import ru.siebel.spring.springwork.service.SimpleService;

@Configuration
public class ConditionalBeans {

    //@Bean
    @Bean("properties")
    @Primary
    @ConditionalOnProperty(
            prefix = "conditional",
            value = "firstFlag",
            havingValue = "true",
            matchIfMissing = true)
    public ConditionalService simpleServiceProperties() {
        return new ConditionalService("Создан через properties");
    }

    //@Bean
    @Bean("onBean")
    @ConditionalOnBean(SimpleService.class)
    public ConditionalService simpleServiceOnBean() {
        return new ConditionalService("Создан через привязку к другому бину, если он есть");
    }

/*    //@Bean
    @Bean("expression")
    @ConditionalOnExpression(
            "${conditional.firstFlag:true} and ${conditional.secondFlag:false}"
    )
    public ConditionalService simpleServiceExpression() {
        return new ConditionalService("Создан через expression");
    }

    //@Bean
    @Bean("onBean")
    @ConditionalOnBean(SimpleService.class)
    public ConditionalService simpleServiceOnBean() {
        return new ConditionalService("Создан через привязку к другому бину, если он есть");
    }

    //@Bean
    @Bean("onMissingBean")
    @ConditionalOnMissingBean(OnlyProdService.class)
    public ConditionalService simpleServiceOnMissingBean() {
        return new ConditionalService("Создан через привязку к другому бину, если его нет");
    }*/


}
