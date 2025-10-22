package ru.kuznetsovMD.iocLab.task27;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.concurrent.CompletableFuture;

@Component
public class AsyncService {
    @Async
    public CompletableFuture<String> getResult() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return CompletableFuture.completedFuture("ASYNC TASK COMPLETED");
    }
}
