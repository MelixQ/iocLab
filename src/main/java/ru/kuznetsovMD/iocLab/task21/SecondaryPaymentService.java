package ru.kuznetsovMD.iocLab.task21;

public class SecondaryPaymentService implements PaymentService {
    @Override
    public void processPayment() {
        System.out.println("Payment processed from SecondaryPaymentService");
    }
}
