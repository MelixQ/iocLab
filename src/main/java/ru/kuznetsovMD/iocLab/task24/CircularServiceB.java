package ru.kuznetsovMD.iocLab.task24;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CircularServiceB {
    private final CircularServiceA circularServiceA;

    @Autowired
    public CircularServiceB(CircularServiceA circularServiceA) {
        this.circularServiceA = circularServiceA;
    }

    public String callA() {
        return circularServiceA.callB();
    }

    public String getMessage() {
        return "Circular Service B";
    }
}
