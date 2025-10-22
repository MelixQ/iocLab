package ru.kuznetsovMD.iocLab.task15;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NotificationService {
    @Autowired
    public void configure(ServiceConfiguration configuration) {
        System.out.println("System configured with: " + configuration);
    }
}
