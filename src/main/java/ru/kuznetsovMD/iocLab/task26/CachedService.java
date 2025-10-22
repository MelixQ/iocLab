package ru.kuznetsovMD.iocLab.task26;


import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class CachedService {

    @Cacheable("expensiveOp")
    public String expensiveOp(int inputData) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return inputData + "- RESULT";
    }
}
