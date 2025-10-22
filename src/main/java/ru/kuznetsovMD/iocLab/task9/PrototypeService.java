package ru.kuznetsovMD.iocLab.task9;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrototypeService {
    public void doSomething() {
        System.out.println("Prototype doSomething");
    }
}
