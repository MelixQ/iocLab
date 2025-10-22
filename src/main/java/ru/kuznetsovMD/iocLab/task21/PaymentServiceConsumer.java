package ru.kuznetsovMD.iocLab.task21;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentServiceConsumer {
    @Autowired
    private PaymentService paymentService;

    public void process()
    {
        paymentService.processPayment();
    }
}
