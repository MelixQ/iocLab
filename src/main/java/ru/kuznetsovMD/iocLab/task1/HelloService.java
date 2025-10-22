package ru.kuznetsovMD.iocLab.task1;

import org.springframework.stereotype.Component;

@Component
public class HelloService {
    public void sayHello() {
        System.out.println("Hello World!");
    }
}
