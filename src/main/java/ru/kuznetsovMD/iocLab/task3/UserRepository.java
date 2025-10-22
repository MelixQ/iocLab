package ru.kuznetsovMD.iocLab.task3;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    public void saveUser(User user) {
        System.out.println("Saving user!");
    }
}
