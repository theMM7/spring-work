package ru.siebel.spring.springwork.service;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CommonService {

    @Autowired
    //@Qualifier("expression")
    @Qualifier("onBean")
    private ConditionalService conditionalService;

    @PostConstruct
    void postConstructExample () {
        System.out.println("Создался бин для CommonService");
    }

    public String execute() {
        return conditionalService.checkValue();
    }
}
