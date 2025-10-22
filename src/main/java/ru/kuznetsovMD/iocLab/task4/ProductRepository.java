package ru.kuznetsovMD.iocLab.task4;

import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {
    public void save(Product product) {
        System.out.println("Saving product!");
    }
}
