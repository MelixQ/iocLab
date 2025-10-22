package ru.kuznetsovMD.iocLab.task5;

import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository {
    public void save(Order order) {
        System.out.println("Saving order!");
    }
}
