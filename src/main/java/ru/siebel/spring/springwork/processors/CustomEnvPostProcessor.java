package ru.siebel.spring.springwork.processors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class CustomEnvPostProcessor implements EnvironmentPostProcessor {
    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
        System.out.println("Исполнение логики из CustomEnvPostProcessor");
        //environment.addActiveProfile("prod");
        //fetchProfile(environment);
    }

    private static void fetchProfile(ConfigurableEnvironment environment) {
        if (new Random().nextBoolean()) {
            System.out.println("Применяется логика с профилем prod");
            environment.addActiveProfile("prod");
        } else {
            System.out.println("Профиль не меняется");
        }
    }
}
