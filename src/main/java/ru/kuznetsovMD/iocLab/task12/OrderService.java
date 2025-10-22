package ru.kuznetsovMD.iocLab.task12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
    @Autowired
    @Qualifier("mir")
    private PaymentService paymentService;

    public String processOrder(double amount) {
        System.out.println(paymentService.processPayment(amount));
        return "";
    }
}
