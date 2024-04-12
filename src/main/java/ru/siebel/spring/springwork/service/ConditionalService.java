package ru.siebel.spring.springwork.service;

public class ConditionalService {

    private String value;

    public ConditionalService(String value) {
        this.value = value;
    }

    public String checkValue() {
        return value;
    }
}
