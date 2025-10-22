package ru.kuznetsovMD.iocLab.task7;

import org.springframework.stereotype.Component;

@Component
public class DieselService implements FuelService {

    @Override
    public void fuel() {
        System.out.println("Diesel service");
    }
}
