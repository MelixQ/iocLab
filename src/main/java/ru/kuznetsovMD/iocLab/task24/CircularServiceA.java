package ru.kuznetsovMD.iocLab.task24;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CircularServiceA {
    private final CircularServiceB circularServiceB;

    @Autowired
    public CircularServiceA(CircularServiceB circularServiceB) {
        this.circularServiceB = circularServiceB;
    }

    public String callB() {
        return circularServiceB.callA();
    }

    public String getMessage() {
        return "Circular Service A";
    }
}
