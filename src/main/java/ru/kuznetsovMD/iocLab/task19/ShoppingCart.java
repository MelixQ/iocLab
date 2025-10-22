package ru.kuznetsovMD.iocLab.task19;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import ru.kuznetsovMD.iocLab.task4.Product;

import java.util.List;

@Component
public class ShoppingCart {
    @Value("${app.list}")
    private List<Product> products;

    public void showCart() {
        products.forEach(product -> System.out.println(product.getName()));
    }
}
