package ru.siebel.spring.springwork.processors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class CustomBeanFactoryBeanPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("Работа CustomBeanFactoryBeanPostProcessor");

        BeanDefinition simpleService = beanFactory.getBeanDefinition("simpleService");
        int argumentCount = simpleService.getConstructorArgumentValues().getArgumentCount();

        System.out.println("Количество аргументов у simpleService " + argumentCount);
        System.out.println("Проверка Scope " + simpleService.getScope());
        System.out.println("Проверка init method name " + simpleService.getInitMethodName());
        System.out.println("Проверка destroy method name " + simpleService.getDestroyMethodName());
    }
}
