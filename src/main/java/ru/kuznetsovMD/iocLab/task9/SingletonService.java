package ru.kuznetsovMD.iocLab.task9;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class SingletonService {
    public void doSomething() {
        System.out.println("Singleton doSomething");
    }

    // Привязывает одно определение компонента к одному экземпляру объекта в каждом контейнере Spring IoC
}
