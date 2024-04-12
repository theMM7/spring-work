package ru.siebel.spring.springwork;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import ru.siebel.spring.springwork.service.FirstWorkService;
import ru.siebel.spring.springwork.service.SecondWorkService;

import java.util.Arrays;

@SpringBootApplication
public class SpringWorkApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringWorkApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            singletonVsPrototype(ctx);
            printAllBeans(ctx);
        };
    }

    private static void singletonVsPrototype(ApplicationContext ctx) {
        System.out.println("----- Работа FirstWorkService -----");
        FirstWorkService firstWorkService = ctx.getBean(FirstWorkService.class);
        System.out.println(firstWorkService.execute());
        System.out.println(" ");
        System.out.println("----- Работа SecondWorkService -----");
        SecondWorkService secondWorkService = ctx.getBean(SecondWorkService.class);
        secondWorkService.execute();
    }

    private static void printAllBeans(ApplicationContext ctx) {
        System.out.println("Вывод на консоль всех созданных бинов в Spring:");

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
    }
}
