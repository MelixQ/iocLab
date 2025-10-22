package ru.kuznetsovMD.iocLab.task10;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class ExampleService {
    @PostConstruct
    public void initialization() {
        System.out.println("Bean initialization");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Bean destroy");
    }
}
