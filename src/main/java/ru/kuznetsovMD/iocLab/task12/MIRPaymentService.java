package ru.kuznetsovMD.iocLab.task12;

import org.springframework.stereotype.Component;

@Component("mir")
public class MIRPaymentService implements PaymentService {
    @Override
    public String processPayment(double amount) {
        return "MIR Payment processed: " + amount;
    }
}
