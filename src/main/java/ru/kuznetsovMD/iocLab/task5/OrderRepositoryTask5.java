package ru.kuznetsovMD.iocLab.task5;

import org.springframework.stereotype.Repository;

@Repository
public class OrderRepositoryTask5 {
    public void save(Order order) {
        System.out.println("Saving order!");
    }
}
