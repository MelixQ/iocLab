package ru.kuznetsovMD.iocLab.task19;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.kuznetsovMD.iocLab.task4.Product;

import java.util.List;

@Component
public class ShoppingCart {
    private List<Product> products;

    @Autowired
    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void showCart() {
        products.forEach(product -> System.out.println(product.getName()));
    }
}
