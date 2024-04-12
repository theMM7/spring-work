package ru.siebel.spring.springwork.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SecondWorkService {
    private SimpleService simpleService;

    @Autowired
    public SecondWorkService(SimpleService simpleService) {
        this.simpleService = simpleService;
    }

    public void execute() {
        simpleService.checkField();
    }
}
