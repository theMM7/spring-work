package ru.siebel.spring.springwork.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "service.configuration")
public class SystemConfig {
    private int key;
    private String value;
    private String description;
    private boolean isBoolean;
}
