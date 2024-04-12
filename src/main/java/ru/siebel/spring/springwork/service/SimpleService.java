package ru.siebel.spring.springwork.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import ru.siebel.spring.springwork.config.SystemConfig;

import java.util.Random;

public class SimpleService {

    @Value("${some.config.value}")
    private String configValue;
    @Autowired
    private SystemConfig systemConfig;
    private int randomValue;

    @PostConstruct
    void postConstructExample() {
        System.out.println("Работа @PostConstruct");
    }

    @PreDestroy
    void preDestroyExample() {
        System.out.println("Работа @PreDestroy");
    }

    public SimpleService() {
        this.randomValue = new Random().nextInt(1, 10);
    }

    public void checkField() {
        System.out.println("Рандомное значение = " + randomValue);
        System.out.println("Одиночное значение из конфига = " + configValue);
        System.out.println("Текущие значения в конфигурации = " + systemConfig);
    }
}
