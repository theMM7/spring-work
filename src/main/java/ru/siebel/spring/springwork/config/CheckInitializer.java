package ru.siebel.spring.springwork.config;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

public class CheckInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        System.out.println("Работа инициалайзера");

        String[] activeProfiles = applicationContext.getEnvironment().getActiveProfiles();
        System.out.println("Полученные профили: " + Arrays.toString(activeProfiles));
    }
}
