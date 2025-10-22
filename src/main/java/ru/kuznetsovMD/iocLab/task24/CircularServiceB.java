package ru.kuznetsovMD.iocLab.task24;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CircularServiceB {
    private CircularServiceA serviceA;

    @Autowired
    public void setServiceA(CircularServiceA serviceA) {
        this.serviceA = serviceA;
    }

    public String callA() {
        return serviceA.getMessage();
    }

    public String getMessage() {
        return "Message from B";
    }
}
