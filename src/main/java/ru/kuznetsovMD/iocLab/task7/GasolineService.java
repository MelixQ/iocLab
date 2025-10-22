package ru.kuznetsovMD.iocLab.task7;

import org.springframework.stereotype.Component;

@Component
public class GasolineService implements FuelService {

    @Override
    public void fuel() {
        System.out.println("GasolineService fuel");
    }
}
