package ru.kuznetsovMD.iocLab.task12;

import org.springframework.stereotype.Component;

@Component("visa")
public class VisaPaymentService implements PaymentService {
    @Override
    public String processPayment(double amount) {
        return "Visa Payment processed: " + amount;
    }
}
