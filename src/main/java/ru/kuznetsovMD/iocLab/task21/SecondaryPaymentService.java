package ru.kuznetsovMD.iocLab.task21;

import org.springframework.stereotype.Component;

@Component
public class SecondaryPaymentService implements PaymentService {
    @Override
    public void processPayment() {
        System.out.println("Payment processed from SecondaryPaymentService");
    }
}
