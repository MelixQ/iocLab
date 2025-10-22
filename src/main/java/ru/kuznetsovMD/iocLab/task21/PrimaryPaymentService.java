package ru.kuznetsovMD.iocLab.task21;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PrimaryPaymentService implements PaymentService {
    @Override
    public void processPayment() {
        System.out.println("Primary service processing payment");
    }
}
