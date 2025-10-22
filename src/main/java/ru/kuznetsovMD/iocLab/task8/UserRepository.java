package ru.kuznetsovMD.iocLab.task8;

import org.springframework.stereotype.Repository;
import ru.kuznetsovMD.iocLab.task3.User;

@Repository
public class UserRepository {
    public void save(User user) {
        System.out.println("Saving user!");
    }
}
