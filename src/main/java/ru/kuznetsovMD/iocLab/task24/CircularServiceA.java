package ru.kuznetsovMD.iocLab.task24;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CircularServiceA {
    private CircularServiceB serviceB;

    @Autowired
    public void setServiceB(CircularServiceB serviceB) {
        this.serviceB = serviceB;
    }

    public String callB() {
        return serviceB.getMessage();
    }

    public String getMessage() {
        return "Message from A";
    }
}
