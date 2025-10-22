package ru.kuznetsovMD.iocLab.task5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceTask5 {
    @Autowired
    private OrderRepositoryTask5 orderRepositoryTask5;

    public void placeOrder(Order order) {
        orderRepositoryTask5.save(order);
    }
}
