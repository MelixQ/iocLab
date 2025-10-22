package ru.kuznetsovMD.iocLab.task5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("v1")
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public void placeOrder(Order order) {
        orderRepository.save(order);
    }
}
