package ru.siebel.spring.springwork.service;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")
public class OnlyProdService {

    @PostConstruct
    void postConstructExample () {
        System.out.println("Создался бин для прода OnlyProdService");
    }
}
