package ru.kuznetsovMD.iocLab.task7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FuelServiceConsumer {
    private final FuelService fuelService;

    @Autowired
    public FuelServiceConsumer(@Qualifier("dieselService") FuelService fuelService) {
        this.fuelService = fuelService;
    }

    public void consumeFuel() {
        fuelService.fuel();
    }
}
