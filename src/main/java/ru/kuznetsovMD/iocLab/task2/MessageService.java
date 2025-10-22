package ru.kuznetsovMD.iocLab.task2;

import org.springframework.stereotype.Component;

@Component
public class MessageService {
    public String getMessage() {
        return "Here are your messages from MessageService!";
    }
}
