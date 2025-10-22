package ru.kuznetsovMD.iocLab.task20;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "ru.kuznetsovMD.iocLab.task20")
public class ComponentScanApp {
    public static void main(String[] args) {
        SpringApplication.run(ComponentScanApp.class, args);
    }
}
