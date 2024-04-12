package ru.siebel.spring.springwork;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration
@ConfigurationProperties(prefix = "service.configuration.properties")
public class TestSystemConfig {
    private int key;
    private String value;
    private String description;
    private boolean isBoolean;
}
